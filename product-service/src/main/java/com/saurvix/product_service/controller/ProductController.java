package com.saurvix.product_service.controller;

import com.saurvix.product_service.dto.ProductRequest;
import com.saurvix.product_service.dto.ProductResponse;
import com.saurvix.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //to declare it as a rest controller to handler rest apis
@RequestMapping("/api/product") //mapping when this to be called
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    //create endpoint to create products
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    //get all products
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProducts();
    }
}
