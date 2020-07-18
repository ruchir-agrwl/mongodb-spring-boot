package com.learn.mongo;

import com.learn.mongo.model.Customer;
import com.learn.mongo.repo.CustomerRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class MongoMvpApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoMvpApplication.class, args);
	}

	@Override
	public void run(String... args) {

		//Deleting all the records before start executing
		customerRepository.deleteAll();

		customerRepository.save(new Customer("Scott","Dana"));
		customerRepository.save(new Customer("Mike","Zane"));

		//Fetch the records
		for(Customer c: customerRepository.findAll()){
			log.info(c.toString());
		}

		//fetching an individual customer
		log.info("Customer found with first name as Mike"+customerRepository.findByFirstName("Mike"));

	}
}
