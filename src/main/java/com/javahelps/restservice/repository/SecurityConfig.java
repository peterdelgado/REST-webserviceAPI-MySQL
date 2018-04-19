package com.javahelps.restservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.javahelps.restservice.entity.Airlines;
import com.javahelps.restservice.repository.UserRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> {
            Airlines user = userRepository.findOne(username);
            if (user != null) {
                return new org.springframework.security.core.userdetails.User(user.getAirlinename(), user.getClient(),
                        true, true, true, true, AuthorityUtils.createAuthorityList("USER"));
            } else {
                throw new UsernameNotFoundException("Could not find the user '" + username + "'");
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
    	http.httpBasic().disable();
    
    
        

// disabling csrf tokens and x-frame-options to be able to run h2 console (localhost:8080/console)
http.csrf().disable();
http.headers().frameOptions().disable();
    
    
    
    
    }
}