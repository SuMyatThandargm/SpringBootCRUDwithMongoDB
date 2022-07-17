package com.ecommerce.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
@Id
private int id;
private int lineNum;
private int orderQty;
private double subTotalAmt;
private Item orderedItem;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getOrderQty() {
	return orderQty;
}
public void setOrderQty(int orderQty) {
	this.orderQty = orderQty;
}

public double getSubTotalAmt() {
	return subTotalAmt;
}
public void setSubTotalAmt(double subTotalAmt) {
	this.subTotalAmt = subTotalAmt;
}
public Item getOrderedItem() {
	return orderedItem;
}
public void setOrderedItem(Item orderedItem) {
	this.orderedItem = orderedItem;
}
public int getLineNum() {
	return lineNum;
}
public void setLineNum(int lineNum) {
	this.lineNum = lineNum;
}

}
