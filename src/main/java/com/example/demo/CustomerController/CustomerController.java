package com.example.demo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomerPojo.Customer;
import com.example.demo.CustomerService.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> save (@RequestBody Customer cust){
		Customer customer=customerService.save(cust);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(customer);
	}
		@DeleteMapping("/delete/{id}")
		public void  deletedata(@PathVariable ("id") Integer id){
			 customerService.delByid(id);
		
	}
		@GetMapping("/getAll")
		public ResponseEntity<List<Customer>> getAll (Customer cust){
			List<Customer> customer=customerService.getAll(cust);
			return ResponseEntity.status(HttpStatus.OK).body(customer);
		}
		
		@GetMapping("/search/{name}")
		public  List<Customer> search (@PathVariable ("name") String name){
			List<Customer> customer=customerService.searchBy(name);
			return customer;
			
		}
		@PutMapping("/update/{id}")
		public ResponseEntity<Customer> updateData (@PathVariable ("id") Integer id, @RequestBody Customer cust){
			Customer customer=customerService.updateData(id, cust);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(customer);
		}
		;
		
}