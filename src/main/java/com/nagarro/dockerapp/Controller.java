package com.nagarro.dockerapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private JdbcTemplate jdbc;
    
    @RequestMapping("/")
    public String home() {
        return "Docker Spring App is started successfully";
    }

	@RequestMapping("/schemas")
	public List<String> getTables() {
		return jdbc.queryForList("SHOW DATABASES", String.class);
	}
}
