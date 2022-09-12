package com.example.ftpatika.service;

import com.example.ftpatika.entity.Product;
import com.example.ftpatika.entity.ProductComment;
import com.example.ftpatika.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getNotExpiredProducts() {

        java.util.Date util_date = new java.util.Date();
        System.out.println(util_date);
        Date sql_date = new Date(util_date.getTime());

        List<Product> query_result = productRepository.findProductByLastUseDayGreaterThanEqualOrLastUseDayIsNull(
                sql_date
        );
        System.out.println(query_result);

        return query_result;
    }

    public List<Product> getExpiredProducts(){

        java.util.Date util_date = new java.util.Date();
        System.out.println(util_date);
        Date sql_date = new Date(util_date.getTime());
        List<Product> query_result = productRepository.findProductByLastUseDayBefore(sql_date);

        System.out.println(query_result);

        return query_result;
    }
}
