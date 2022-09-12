package com.example.ftpatika.controller;

import com.example.ftpatika.entity.ProductComment;
import com.example.ftpatika.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/productComments")
public class ProductCommentController {

    @Autowired
    private ProductCommentService productCommentService;

    public ProductCommentController(ProductCommentService productCommentService) {
        this.productCommentService = productCommentService;
    }

    @GetMapping("/product_id={product_id}")
    public List<ProductComment> getProductComments(@PathVariable("product_id") String id_param){
        try{    // for int into long conversion
            long id = Long.parseLong(id_param);
            return productCommentService.getCommentsOfProduct( id);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    @GetMapping("/product_id={product_id}/starting_date={starting_date}/ending_date={ending_date}")
    public List<ProductComment> getProductCommentsBetweenDate(
            @PathVariable("product_id") String id_param,
            @PathVariable("starting_date") String starting_date_param,
            @PathVariable("ending_date") String ending_date_param
    ){
        try{    // for int into long and date conversions
            long id = Long.parseLong(id_param);
            Date starting_date = Date.valueOf(starting_date_param);
            Date ending_date = Date.valueOf(ending_date_param);
            return productCommentService.getCommentsOfProductBetweenDates( id, starting_date, ending_date);

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    @GetMapping("/user_id={user_id}")
    public List<ProductComment> getCommentsOfUser(@PathVariable("user_id") String id_param){
        try {    // for int into long conversion
            long id = Long.parseLong(id_param);
            return productCommentService.getCommentsOfUser(id);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    @GetMapping("/user_id={user_id}/starting_date={starting_date}/ending_date={ending_date}")
    public List<ProductComment> getCommentsOfUserBetweenDates(
            @PathVariable("user_id") String id_param,
            @PathVariable("starting_date") String starting_date_param,
            @PathVariable("ending_date") String ending_date_param){

        try{    // for int into long and date conversions
            long id = Long.parseLong(id_param);
            Date starting_date = Date.valueOf(starting_date_param);
            Date ending_date = Date.valueOf(ending_date_param);
            return productCommentService.getCommentsOfUserBetweenDates(id, starting_date, ending_date);

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


}
