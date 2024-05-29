package com.project.todomanagement.service;

import com.project.todomanagement.dto.JwtAuthResponse;
import com.project.todomanagement.dto.LoginDto;
import com.project.todomanagement.dto.RegisterDto;

public interface AuthService {

    String register(RegisterDto registerDto);
    JwtAuthResponse login(LoginDto loginDto);
}
