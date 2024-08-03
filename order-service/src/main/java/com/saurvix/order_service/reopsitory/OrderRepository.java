package com.saurvix.order_service.reopsitory;

import com.saurvix.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
