package com.spring.provider.provider;

import com.spring.api.CustomerApi;
import com.spring.api.dto.CustomerDTO;

import io.github.projecthsf.annotation.HsfProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@HsfProvider
@RequiredArgsConstructor
@Slf4j
public class CustomerApiImpl implements CustomerApi {
    @Override
    public CustomerDTO getCustomer(int id) {
        CustomerDTO dto = new CustomerDTO();
        dto.setId(1);
        dto.setName("Name 1 -> ");
        //log.info("=============== mapper {}",customerMapper.getCustomer());
        return dto;
    }

    @Override
    public List<CustomerDTO> getList(int groupId) {
        List<CustomerDTO> dtos = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            CustomerDTO dto = new CustomerDTO();
            dto.setId(i);
            dto.setName("Name " + i);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public int getCount(int groupId) {
        return 50;
    }

    @Override
    public Map<String, CustomerDTO> getMap(int groupId) {
        Map<String, CustomerDTO> map = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            CustomerDTO dto = new CustomerDTO();
            dto.setId(i);
            dto.setName("Name " + i);
            map.put("customer"  + i, dto);
        }
        return map;
    }
}
