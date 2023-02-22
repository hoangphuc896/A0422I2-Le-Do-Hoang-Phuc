package com.example.ss11mvc.service;

import com.example.ss11mvc.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    List<Product> searchProductName(String name);

    void remove(int id);
}
