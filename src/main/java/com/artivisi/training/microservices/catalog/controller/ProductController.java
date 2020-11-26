package com.artivisi.training.microservices.catalog.controller;

import com.artivisi.training.microservices.catalog.dao.ProductDao;
import com.artivisi.training.microservices.catalog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/product")
public class ProductController {

    @Autowired private ProductDao productDao;

    @GetMapping("/")
    public Page<Product> products(Pageable pageable) {
        return productDao.findAll(pageable);
    }
}
