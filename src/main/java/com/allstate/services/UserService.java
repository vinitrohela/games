package com.allstate.services;

import com.allstate.entities.User;
import com.allstate.repositories.IUserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private IUserRepositories repositories;

    @Autowired
    public void setRepositories(IUserRepositories repositories) {
        this.repositories = repositories;
    }

    public User create(String name){
        return this.repositories.save(new User(name));
    }

    public User createUserWithBalance(String name, int balance){
        return this.repositories.save(new User(name, balance));
    }
}
