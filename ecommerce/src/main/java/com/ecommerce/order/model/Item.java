package com.ecommerce.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Item")
public class Item {
	@Id
   private int id;
   private String itemNum;
   private String itemName;
   private String itemDescription;
   private double unitPrice;
   private int itemstatus;
   private String category;
   public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Item(int id,String itemNum,String itemName,String itemDescription) {
	   this.id=id;
	   this.itemNum=itemNum;
	   this.itemName=itemName;
	   this.itemDescription=itemDescription;
   }
public String getItemNum() {
	return itemNum;
}
public void setItemNo(String itemNo) {
	this.itemNum = itemNo;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItemDescription() {
	return itemDescription;
}
public void setItemDescription(String itemDescription) {
	this.itemDescription = itemDescription;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public int getItemstatus() {
	return itemstatus;
}
public void setItemstatus(int itemstatus) {
	this.itemstatus = itemstatus;
}
   
   
   
}
