package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"IPhone",15.000,"Vip","Nhật"));
        products.add(new Product(2,"Samsung",30.000,"Vip","Thái"));
        products.add(new Product(3,"Máy Giặt",15.000,"Vip","Nhật"));
        products.add(new Product(4,"Tử Lạnh",45.000,"Vip","Mỹ"));

    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
    products.add(product);
    }

    @Override
    public void update(Product product) {
    products.set(product.getId()-1,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id-1);
    }

    @Override
    public void delete(int id) {
    products.remove(id);
    }

    @Override
    public List<Product> SeachByName(String name) {
        List<Product>productList= new ArrayList<>();
        for (Product product : products){
            if(product.getName().contains(name)){
                productList.add(product);
            }
        }
        return productList;
    }
}
