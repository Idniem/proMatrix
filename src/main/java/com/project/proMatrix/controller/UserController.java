package com.project.proMatrix.controller;

import com.project.proMatrix.model.Role;
import com.project.proMatrix.model.User;
import com.project.proMatrix.model.UserRole;
import com.project.proMatrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setId(45L);
        role.setName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return userService.createUser(user, roles);

    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

}
