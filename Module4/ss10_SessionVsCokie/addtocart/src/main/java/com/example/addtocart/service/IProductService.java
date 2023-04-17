package com.example.addtocart.service;

import com.example.addtocart.entity.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
