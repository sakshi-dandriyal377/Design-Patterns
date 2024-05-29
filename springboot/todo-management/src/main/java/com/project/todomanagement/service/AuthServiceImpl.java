package com.project.todomanagement.service;

import com.project.todomanagement.dto.JwtAuthResponse;
import com.project.todomanagement.dto.LoginDto;
import com.project.todomanagement.dto.RegisterDto;
import com.project.todomanagement.entity.Role;
import com.project.todomanagement.entity.User;
import com.project.todomanagement.exception.TodoApiException;
import com.project.todomanagement.repository.RoleReository;
import com.project.todomanagement.repository.UserRepository;
import com.project.todomanagement.security.JwtTokenProvider;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService{

    private UserRepository userRepository;
    private RoleReository roleReository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public String register(RegisterDto registerDto) {
        //check username already exists in db
        if(userRepository.existsByUsername(registerDto.getUsername())){
            throw  new TodoApiException(HttpStatus.BAD_REQUEST,"username already exists");
        }

        if(userRepository.existsByEmail(registerDto.getEmail())){
            throw new TodoApiException(HttpStatus.BAD_REQUEST,"email already exists");
        }

        User newUser = new User();
        newUser.setName(registerDto.getName());
        newUser.setUsername(registerDto.getUsername());
        newUser.setEmail(registerDto.getEmail());
        newUser.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Set<Role> roles = new HashSet<>();
        Role userRole = roleReository.findByName("Role_USER");
        roles.add(userRole);

        newUser.setRoles(roles);

        userRepository.save(newUser);

        return "user register successfully";
    }

    @Override
    public JwtAuthResponse login(LoginDto loginDto) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(),
                loginDto.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenProvider.generateToken(authentication);

        Optional<User> userOptional  = userRepository.findByUsernameOrEmail(loginDto.getUsernameOrEmail(), loginDto.getUsernameOrEmail());
        String role = null;
        if(userOptional.isPresent()){
            User loggedInUser = userOptional.get();
           Optional<Role> optionalRole = loggedInUser.getRoles().stream().findFirst();

           if(optionalRole.isPresent()){
               Role userRole = optionalRole.get();
               role = userRole.getName();
           }
        }

        JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
        jwtAuthResponse.setRole(role);
        jwtAuthResponse.setAccessToken(token);
        return jwtAuthResponse;
    }
}
