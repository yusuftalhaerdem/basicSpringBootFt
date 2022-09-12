package com.example.ftpatika.repository;

import com.example.ftpatika.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;



@Repository
public interface ProductCommentRepository extends JpaRepository<ProductComment, Long> {
    Optional<ProductComment> findById(Long id);

    List<ProductComment> findByProductId(Long id);
    List<ProductComment> findProductCommentByProductIdAndCommentDateBetween(Long productId, Date starting_date, Date ending_date);
    List<ProductComment> findByUserId(Long id);
    List<ProductComment> findProductCommentByUserIdAndCommentDateIsBetween(Long userId,Date starting_date, Date ending_date);

    /*
    @Query("SELECT pc FROM ProductComment pc where pc.commentDate>= :starting_date and pc.commentDate<=:ending_date")
    List<ProductComment> findProductCommentBetweenDates(
            @Param("starting_date") Date starting_date, @Param("ending_date") Date ending_date
    );
     */

}
