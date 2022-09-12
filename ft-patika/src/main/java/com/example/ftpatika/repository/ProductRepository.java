package com.example.ftpatika.repository;

import com.example.ftpatika.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByLastUseDayBefore(Date current_date);
    List<Product> findProductByLastUseDayGreaterThanEqualOrLastUseDayIsNull(Date current_date);

}
