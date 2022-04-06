package com.example.firstspringapp;

import org.springframework.data.repository.CrudRepository;

// crud - create read update delete

public interface UserRepository extends CrudRepository<User, Integer> {
}
