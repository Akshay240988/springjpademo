package com.springjpa.springjpademo.controller;

import com.springjpa.springjpademo.model.Product;
import com.springjpa.springjpademo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getproducts")
    public List<Product> getAllUnsoldProducts(){
        return productRepository.findAllUnsoldProducts();

    }


}
