package com.artivisi.training.microservices.catalog.dao;

import com.artivisi.training.microservices.catalog.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}
