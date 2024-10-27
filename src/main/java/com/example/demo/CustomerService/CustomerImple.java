package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.handler.ExceptionHandlingWebHandler;

import com.example.demo.CustomerPojo.Customer;
import com.example.demo.CustomerRepository.CustomerRepo;


@Service                                     
public class CustomerImple implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer save(Customer customer) {
		Customer cust1 =customerRepo.save(customer);
		
		return cust1;
	}

	@Override
	public void delByid(Integer id) {
		customerRepo.deleteById(id);
		
	}

	@Override
	public List<Customer> getAll(Customer customer) {
		List<Customer> cust=(List<Customer>) customerRepo.findAll();
		return (List<Customer>) cust;
	}

	@Override
	public List<Customer> searchBy(String name) {
		 List<Customer> cust= customerRepo.findByName(name);
		 return cust;
	}

	@Override
	public Customer updateData(Integer id, Customer customer) {
		Customer custt=customerRepo.findById(id).get();
		custt.setName(customer.getName());
		custt.setAddress(customer.getAddress());
		custt.setMobileNo(customer.getMobileNo());
		return customerRepo.save(custt);
	}



}
