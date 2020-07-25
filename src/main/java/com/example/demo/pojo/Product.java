package com.example.demo.pojo;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String storeName;
    private String productVersion;
    private double productPrice;
    private Integer productStock;
    private Integer productOut;

}
