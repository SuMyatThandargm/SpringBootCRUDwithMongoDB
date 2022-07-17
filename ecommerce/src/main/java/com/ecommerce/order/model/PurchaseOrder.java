package com.ecommerce.order.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.ecommerce.common.model.User;

public class PurchaseOrder {
	@Id
	private int id;
	private Date orderDate;
	@DBRef
	private ArrayList<Order> ordersList;
	@DBRef
	private User orderedUser;
	private double totalAmt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public ArrayList<Order> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(ArrayList<Order> ordersList) {
		this.ordersList = ordersList;
	}
	public User getOrderedUser() {
		return orderedUser;
	}
	public void setOrderedUser(User orderedUser) {
		this.orderedUser = orderedUser;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
}
