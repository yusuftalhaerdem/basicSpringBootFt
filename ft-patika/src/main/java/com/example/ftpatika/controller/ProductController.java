package com.example.ftpatika.controller;

import com.example.ftpatika.entity.Product;
import com.example.ftpatika.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/notExpired")
    public List<Product> getNotExpiredProducts() {
        return productService.getNotExpiredProducts();
    }

    @GetMapping("/expired")
    public List<Product> getExpiredProducts() {
        return productService.getExpiredProducts();
    }

}