package com.example.demo.CustomerService;

import java.util.List;

import com.example.demo.CustomerPojo.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	
	public void delByid(Integer id);
	
	public List<Customer> getAll(Customer customer);
	
	public List<Customer> searchBy(String name);
	
	public Customer updateData(Integer id, Customer customer);
		
	

}
