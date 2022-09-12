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
public class ProductComment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String comment;
    private Date commentDate;
    private Long userId;
    private Long productId;

    public ProductComment() {}


    public ProductComment(Long id, String comment, Date commentDate, Long userId, Long productId) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.userId = userId;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return String.format(
                "ProductComment[id=%d, comment='%s', commentDate='%s', userId='%s', productId='%s']",
                id, comment, commentDate, userId, productId);
    }


}
