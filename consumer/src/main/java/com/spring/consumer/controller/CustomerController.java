package com.spring.consumer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.api.CustomerApi;
import com.spring.api.dto.CustomerDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    @Getter
    @Setter
    public static class Address {
        private String street;
        private String city;
    }

    @Getter
    @Setter
    public static class Child {
        private int age;
        private String name;
    }

    @Getter
    @Setter
    public static class Person {
        private int age;
        private String name;
        private List<String> cars;
        private Address address;
        private List<Child> children;
    }

    private final CustomerApi customerApi;

    @GetMapping("/customer")
    public List<CustomerDTO> getList() throws JsonProcessingException {
        return customerApi.getList(1);
    }

    @GetMapping("/customer/detail")
    public CustomerDTO getDetail() {
        return customerApi.getCustomer(1);
    }

    @GetMapping("/customer/count")
    public Integer getCount() {
        return customerApi.getCount(1);
    }

    @GetMapping("/customer/map")
    public Map<String, CustomerDTO> getMap() {
        return customerApi.getMap(1);
    }
}
