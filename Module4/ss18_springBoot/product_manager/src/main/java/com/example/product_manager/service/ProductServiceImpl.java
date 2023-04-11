package com.example.product_manager.service;

import com.example.product_manager.model.Product;
import com.example.product_manager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository repository ;
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void create(Product product) {
        repository.save(product);
    }

    @Override
    public void update(Product product) {
        repository.save(product);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
