package com.example.ss11mvc.service;

import com.example.ss11mvc.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IProductServiceImpl implements IProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone14", "15.000", "tốt", "Mỹ"));
        products.put(2, new Product(2, "Iphone12", "20.000", "xấu", "anh"));
        products.put(3, new Product(4, "Iphone11", "25.000", "ổn", "nhật"));
        products.put(4, new Product(5, "IphoneX", "30.000", "bình thường", "canada"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public List<Product> searchProductName(String name) {
        List<Product> products = findAll();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getNameProduct().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
