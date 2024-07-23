package com.example.customerprovincemanagement.service;

import com.example.customerprovincemanagement.model.Customer;
import com.example.customerprovincemanagement.model.Province;


public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
