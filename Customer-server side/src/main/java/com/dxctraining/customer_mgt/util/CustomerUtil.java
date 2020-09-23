package com.dxctraining.customer_mgt.util;

import org.springframework.stereotype.Component;

import com.dxctraining.customer_mgt.dto.*;
import com.dxctraining.customer_mgt.entities.*;

@Component
public class CustomerUtil {


    public CustomerDetails customerDto(Customer customer){
        CustomerDetails details=new CustomerDetails(customer.getId(),customer.getName(),customer.getBalance());
        return details;
    }

}
