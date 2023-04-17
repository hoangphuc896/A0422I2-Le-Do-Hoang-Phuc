package com.example.addtocart.service;

import com.example.addtocart.entity.Product;
import com.example.addtocart.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository repository;


    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }
}
