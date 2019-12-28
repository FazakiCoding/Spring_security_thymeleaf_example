package com.example.Spring_boot_security_thymeleaf.DAO;

import com.example.Spring_boot_security_thymeleaf.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String userName);
}
