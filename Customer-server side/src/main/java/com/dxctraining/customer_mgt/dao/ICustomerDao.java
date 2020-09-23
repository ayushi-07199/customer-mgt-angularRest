package com.dxctraining.customer_mgt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.customer_mgt.entities.*;

public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}
