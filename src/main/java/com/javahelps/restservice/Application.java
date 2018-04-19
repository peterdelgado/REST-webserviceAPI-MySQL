package com.javahelps.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.jdbc.core.RowMapper;
import com.javahelps.restservice.entity.*;

@SpringBootApplication
public class Application implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//log.info("Querying for customer records where first_name = 'Josh':");
	
	
		//log.info("Querying for customer records where first_name = 'Josh':");
		
		jdbcTemplate.query(
                "SELECT * FROM Airlines WHERE airlinename = ?", new Object[] { "Blue Air" },
                (rs, rowNum) -> new Airlines(rs.getString("airlinename"))           
        ).forEach(airlines -> log.info(airlines.toString()));
	
		
	
	}




}



