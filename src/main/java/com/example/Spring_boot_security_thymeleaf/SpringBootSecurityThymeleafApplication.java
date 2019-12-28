package com.example.Spring_boot_security_thymeleaf;

import com.example.Spring_boot_security_thymeleaf.Domaine.RoleVo;
import com.example.Spring_boot_security_thymeleaf.Domaine.UserVo;
import com.example.Spring_boot_security_thymeleaf.Service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityThymeleafApplication implements CommandLineRunner {

	@Autowired
	private IUserService userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityThymeleafApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	@Override
	public void run(String... args) throws Exception {
		userService.cleanDataBase();
		userService.save(new RoleVo("ADMIN"));
		userService.save(new RoleVo("CLIENT"));

		RoleVo roleAdmin=userService.getRoleByName("ADMIN");
		RoleVo roleClient=userService.getRoleByName("CLIENT");
		UserVo admin1=new UserVo("admin1", "admin1",Arrays.asList(roleAdmin));
		UserVo client1=new UserVo("client1","client1",Arrays.asList(roleClient));
		userService.save(admin1);
		userService.save(client1);
	}

}
