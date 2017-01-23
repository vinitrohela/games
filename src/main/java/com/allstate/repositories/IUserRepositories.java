package com.allstate.repositories;

import com.allstate.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepositories extends CrudRepository<User, Integer> {

}
