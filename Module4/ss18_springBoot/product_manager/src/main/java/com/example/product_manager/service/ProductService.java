package com.example.product_manager.service;

import com.example.product_manager.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void create(Product product);

    void update(Product product);

    void delete(int id);
}
