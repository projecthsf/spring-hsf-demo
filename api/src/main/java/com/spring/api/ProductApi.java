package com.spring.api;

import com.spring.api.dto.CustomerDTO;
import com.spring.api.dto.ProductDTO;

import java.util.List;

public interface ProductApi {
    ProductDTO getProduct(int id);
    List<ProductDTO> getProducts(int categoryId);
    int getCount(int categoryId);
}
