package com.javastarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String sql = "INSERT INTO INFO (NAME,SALARY, AGE) VALUES(?,?,?)";
		int result = jdbcTemplate.update(sql, "YADAV","5000","55");
		if(result>0 ) {
			System.out.println("Inserted");
		}
		
	}

}
