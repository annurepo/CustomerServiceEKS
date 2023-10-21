package com.natwest.eks.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.eks.model.Customer;

@RestController
@RequestMapping("api/v1")
public class customerController 
{
	  List<Customer> cust = new ArrayList<Customer>();
	  
	  @GetMapping("/getallcustomer")
	    public List<Customer> getCustomers(){
	            return cust;
	    }
	    
	    @PostMapping("/postcustomer")
	    public String postCustomer(@RequestBody Customer customer){
	        cust.add(customer);
	        
	        return "Sucessful!";
	    }
}
