package com.learn.mongo.repo;

import com.learn.mongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,String> {

    String findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);

}
