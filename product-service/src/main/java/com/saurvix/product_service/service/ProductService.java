package com.saurvix.product_service.service;

import com.saurvix.product_service.dto.ProductRequest;
import com.saurvix.product_service.dto.ProductResponse;
import com.saurvix.product_service.model.Product;
import com.saurvix.product_service.repository.ProductRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //to declare it as a service class
@RequiredArgsConstructor //no need to add constructor for productRepository
@Slf4j //for logs
public class ProductService {

    private final ProductRespository productRespository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRespository.save(product);
        log.info("Product {} is saved ---- " , product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRespository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
