package com.project.proMatrix.service;

import com.project.proMatrix.model.User;
import com.project.proMatrix.model.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> roles) throws Exception;

    public User getUser(String username);


}
