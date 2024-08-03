package com.saurvix.product_service.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    public String name;
    public String description;
    public BigDecimal price;

}
