package com.example.demo.CustomerRepository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CustomerPojo.Customer;
import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Serializable> {
      public  List<Customer> findByName(String name);

	
}
