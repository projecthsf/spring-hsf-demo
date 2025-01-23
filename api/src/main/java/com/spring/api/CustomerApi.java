package com.spring.api;

import com.spring.api.dto.CustomerDTO;

import java.util.List;
import java.util.Map;

public interface CustomerApi {
    CustomerDTO getCustomer(int id);
    List<CustomerDTO> getList(int groupId);
    Map<String, CustomerDTO> getMap(int groupId);
    int getCount(int groupId);
}
