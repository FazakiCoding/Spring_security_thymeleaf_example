package com.example.Spring_boot_security_thymeleaf.Service;

import com.example.Spring_boot_security_thymeleaf.Domaine.RoleVo;
import com.example.Spring_boot_security_thymeleaf.Domaine.UserVo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    void save(UserVo user);
    void save(RoleVo role);
    List<UserVo> getAllUsers();
    List<RoleVo> getAllRoles();
    RoleVo getRoleByName(String role);
    void cleanDataBase();
}

