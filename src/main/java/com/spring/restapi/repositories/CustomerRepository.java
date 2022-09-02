package com.spring.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restapi.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
