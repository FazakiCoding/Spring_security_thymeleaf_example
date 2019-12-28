package com.example.Spring_boot_security_thymeleaf.DAO;

import com.example.Spring_boot_security_thymeleaf.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findByRole(String role);
    List<Role> findAll();

}
