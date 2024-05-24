package com.project.todomanagement.repository;

import com.project.todomanagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReository extends JpaRepository<Role,Long> {

    Role findByName(String role);

}
