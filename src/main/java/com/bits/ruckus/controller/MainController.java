package com.bits.ruckus.controller;

import com.bits.ruckus.model.Product;
import com.bits.ruckus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getMain() {
        return "Hello!";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAll();
    }
}
