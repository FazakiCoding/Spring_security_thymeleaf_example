package com.example.Spring_boot_security_thymeleaf.Domaine;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class UserVo {
    private Long id;
    private String username;
    private String password;
    private List<RoleVo> roles = new ArrayList<RoleVo>();

    public UserVo(String username, String password,List<RoleVo> roles) {
        this.username = username;
        this.password = password;
        this.roles=roles;
    }
    public UserVo() {
        this.username = null;
        this.password = null;
        this.roles=new ArrayList<RoleVo>();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleVo> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleVo> roles) {
        this.roles = roles;
    }
}
