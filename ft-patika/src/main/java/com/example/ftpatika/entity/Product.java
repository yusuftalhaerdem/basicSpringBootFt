package com.example.ftpatika.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    // may use it as Java.util.Date or Java.sql.Date, but for now i will skip
    private Date lastUseDay;

    public Product() {}
    public Product(Long id, String name, Double price, Date lastUseDay) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.lastUseDay = lastUseDay;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%d, name='%s', price='%s', lastUseDay='%s']",
                id, name, price, lastUseDay);
    }
}
