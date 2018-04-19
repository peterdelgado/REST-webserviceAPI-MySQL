package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.Airlines;;

@RestResource(exported = false) 
public interface UserRepository extends JpaRepository<Airlines, String> {

}