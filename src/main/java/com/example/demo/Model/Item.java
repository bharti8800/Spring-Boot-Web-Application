package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class Item {
	
	private int serialId;
	private String name;
	private int quantity;
	public int getSerialId() {
		return serialId;
	}
	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [serialId=" + serialId + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
