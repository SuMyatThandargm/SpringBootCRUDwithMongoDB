package com.ecommerce.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.order.model.PurchaseOrder;
@Repository
public interface PurchaseOrderRepository extends MongoRepository<PurchaseOrder,Integer>{

}
