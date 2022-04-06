package com.example.firstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserRepository repository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                           @RequestParam Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        repository.save(user);
        return "Saved successefull!";
    }
    @GetMapping("all")
    public @ResponseBody Iterable<User> getAll() {
        return repository.findAll();
    }
}
