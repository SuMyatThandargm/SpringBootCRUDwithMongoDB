package com.ecommerce.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order.model.PurchaseOrder;
import com.ecommerce.order.service.PurchaseOrderService;

@RestController
@RequestMapping("/po")
public class PurchaseOrderController {
	@Autowired
	private PurchaseOrderService poService;
	@GetMapping("/showOrder")
public String showOrderPage() {
	return "Welcome to Order";
}
	@PostMapping("/createOrder")
public ResponseEntity createPurchaseOrder(@RequestBody PurchaseOrder po) {
	return ResponseEntity.ok(poService.createPurchaseOrder(po));
}
}
