package com.project.proMatrix;

import com.project.proMatrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProMatrixApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ProMatrixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		User user = new User();
//
//		user.setFirstName("Darek");
//		user.setLastName("Niem");
//		user.setUsername("daNiem");
//		user.setPassword("pass");
//		user.setEmail("abc@email.com");
//		user.setProfile("DontKnow");
//
//		Role role1 = new Role();
//
//		role1.setId(44L);
//		role1.setName("ADMIN");
//
//		Set<UserRole> userRoles = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoles.add(userRole);
//
//		userService.createUser(user, userRoles);

	}
}
