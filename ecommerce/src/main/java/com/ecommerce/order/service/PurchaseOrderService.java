package com.ecommerce.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.order.model.PurchaseOrder;
import com.ecommerce.order.repository.PurchaseOrderRepository;
@Service
public class PurchaseOrderService {
	@Autowired
     private PurchaseOrderRepository poRepository;
     public PurchaseOrder createPurchaseOrder(PurchaseOrder orders) {
    	 return poRepository.save(orders);
     }
}
