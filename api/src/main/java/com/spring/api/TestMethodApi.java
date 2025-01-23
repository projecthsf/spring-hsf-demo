package com.spring.api;

import com.spring.api.dto.CustomerDTO;

import java.util.List;

public interface TestMethodApi {
    CustomerDTO getCustomer(int id);
    List<CustomerDTO> getCustomers(int groupId);
    List<CustomerDTO> getByName(String name);
    int getCountCustomers(int groupId);
}
