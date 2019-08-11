package com.eknows.training_v4.product.respository;

import com.eknows.training_v4.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
