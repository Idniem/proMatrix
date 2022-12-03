package com.project.proMatrix.service.impl;

import com.project.proMatrix.model.User;
import com.project.proMatrix.model.UserRole;
import com.project.proMatrix.repository.RoleRepository;
import com.project.proMatrix.repository.UserRepository;
import com.project.proMatrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> roles) throws Exception{

        User newUser = userRepository.findByUsername(user.getUsername());

        if (newUser != null) {
            throw new Exception("User already exist!");
        } else {
           for (UserRole ur:roles) {
               roleRepository.save(ur.getRole());
           }

           user.getRoles().addAll(roles);
           user = userRepository.save(user);
        }
        return user;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

}
