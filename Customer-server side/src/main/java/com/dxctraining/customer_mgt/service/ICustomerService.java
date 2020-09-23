package com.dxctraining.customer_mgt.service;

import java.util.List;

import com.dxctraining.customer_mgt.entities.*;

public interface ICustomerService {

	Customer findById(int id);

	Customer save(Customer customer);

	void remove(int id);

	List<Customer> allCustomers();

}
