package com.saurvix.inventory_service;

import com.saurvix.inventory_service.model.Inventory;
import com.saurvix.inventory_service.repository.InventoryRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRespository inventoryRespository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("IPhone_13");
			inventory.setQuantity(20);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("IPhone_13_plus");
			inventory1.setQuantity(0);

			inventoryRespository.save(inventory1);
			inventoryRespository.save(inventory);
		};
	}

}
