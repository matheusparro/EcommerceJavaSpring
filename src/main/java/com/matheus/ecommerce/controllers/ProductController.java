package com.matheus.ecommerce.controllers;

import com.matheus.ecommerce.entities.product.ProductDTO;
import com.matheus.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;
    @GetMapping("/{id}")
    //get json hello world
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return dto;
    }

    @GetMapping
    //get json hello world
    public Page<ProductDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}
