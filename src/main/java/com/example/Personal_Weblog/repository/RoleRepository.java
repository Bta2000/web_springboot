package com.example.Personal_Weblog.repository;

import com.example.Personal_Weblog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository  extends JpaRepository<Role, Long> {
    Optional<Role> getRoleByName(String name);
}
