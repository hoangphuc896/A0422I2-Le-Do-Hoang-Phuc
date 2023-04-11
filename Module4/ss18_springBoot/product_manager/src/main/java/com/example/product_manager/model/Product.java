package com.example.product_manager.model;

import javax.persistence.*;

@Entity
@Table(name ="product")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nameProduct;
    private double priceProduct;
    @Column(name = "[describe]")
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, double priceProduct, String describe, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.describe = describe;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
