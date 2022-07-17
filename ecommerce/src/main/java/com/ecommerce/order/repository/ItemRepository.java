package com.ecommerce.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.order.model.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item,Integer>{
       
}
