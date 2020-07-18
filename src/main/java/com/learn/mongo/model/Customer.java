package com.learn.mongo.model;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@ToString
public class Customer {

    @Id
    String id;
    String firstName;
    String lastName;
    Address address;


    public Customer(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
