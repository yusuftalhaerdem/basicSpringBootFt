package com.example.ftpatika;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Controller {

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }


}
