package com.matheus.ecommerce.repositories;

import com.matheus.ecommerce.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
