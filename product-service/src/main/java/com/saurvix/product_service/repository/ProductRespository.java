package com.saurvix.product_service.repository;

import com.saurvix.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product, String> {
}
