package com.example.cart.Repository;

import com.example.cart.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product , Long> {
}
