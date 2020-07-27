package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private Integer id;
    private String storeName;
    private String productVersion;
    private double productPrice;
    private Integer productStock;
    private Integer productOut;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductOut() {
        return productOut;
    }

    public void setProductOut(Integer productOut) {
        this.productOut = productOut;
    }
}
