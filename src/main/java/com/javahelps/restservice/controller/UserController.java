package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Airlines;
import com.javahelps.restservice.repository.UserRepository;

import javassist.tools.web.BadHttpRequest;


@RestController
@RequestMapping(path = "/airlines")
public class UserController {

    @Autowired
    private UserRepository repository;
        

    //@GetMapping
     
//    public Iterable<Airlines> findAll() {
//        return repository.findAll();
//    }

    @GetMapping(path = "/{airlinename}")
    public Airlines find(@PathVariable("airlinename") String airlinename) {
        return repository.findOne(airlinename);
    }

    @PostMapping(consumes = "application/json")
    public Airlines create(@RequestBody Airlines user) {
        return repository.save(user);
    }

    @DeleteMapping(path = "/{username}")
    public void delete(@PathVariable("username") String username) {
        repository.delete(username);
    }

    @PutMapping(path = "/{username}")
    public Airlines update(@PathVariable("username") String username, @RequestBody Airlines user) throws BadHttpRequest {
        if (repository.exists(username)) {
            user.setAirlinename(username);
            return repository.save(user);
        } else {
            throw new BadHttpRequest();
        }
    }

}