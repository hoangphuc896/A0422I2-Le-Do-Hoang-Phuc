package com.example.tocart.service;

import com.example.tocart.entity.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
