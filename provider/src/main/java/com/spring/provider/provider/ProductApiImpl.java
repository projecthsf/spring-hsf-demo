package com.spring.provider.provider;

import com.spring.api.ProductApi;
import com.spring.api.dto.ProductDTO;

import io.github.projecthsf.annotation.HsfProvider;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@HsfProvider
@RequiredArgsConstructor
public class ProductApiImpl implements ProductApi {
    @Override
    public ProductDTO getProduct(int id) {
        ProductDTO dto = new ProductDTO();
        dto.setName("Product 1");
        return dto;
    }

    @Override
    public List<ProductDTO> getProducts(int categoryId) {
        List<ProductDTO> dtos = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            ProductDTO dto = new ProductDTO();
            dto.setId(i);
            dto.setName("Product " + i);
            dtos.add(dto);
        }

        return dtos;
    }

    @Override
    public int getCount(int categoryId) {
        return 70;
    }
}
