package com.example.demo.pojo;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String storeName;
    private String productVersion;
    private double productPrice;
    private int productInNum;
    private int productOutNum;

}
