package com.saurvix.inventory_service.repository;

import com.saurvix.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRespository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode(String skuCode);
}
