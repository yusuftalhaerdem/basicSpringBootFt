package com.example.ftpatika.service;

import com.example.ftpatika.entity.ProductComment;
import com.example.ftpatika.repository.ProductCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ProductCommentService {

    private ProductCommentRepository productCommentRepository;

    public ProductCommentService(ProductCommentRepository productCommentRepository) {
        this.productCommentRepository = productCommentRepository;
    }

    public List<ProductComment> getCommentsOfProduct(Long productId){
        List<ProductComment> query_result = productCommentRepository.findByProductId(productId);
        System.out.println(query_result);
        return query_result;
    }
    public List<ProductComment> getCommentsOfProductBetweenDates(Long productId, Date startingDate, Date endingDate ){
        List<ProductComment> query_result = productCommentRepository.findProductCommentByProductIdAndCommentDateBetween(
                productId, startingDate, endingDate
        );
        System.out.println(query_result);
        return query_result;
    }
    public List<ProductComment> getCommentsOfUser(Long userId){
        List<ProductComment> query_result = productCommentRepository.findByUserId(userId);
        System.out.println(query_result);
        return query_result;
    }
    public List<ProductComment> getCommentsOfUserBetweenDates(Long userId, Date startingDate, Date endingDate){
        List<ProductComment> query_result = productCommentRepository.
                findProductCommentByUserIdAndCommentDateIsBetween(userId, startingDate,endingDate);
        System.out.println(query_result);
        return query_result;
    }


}
