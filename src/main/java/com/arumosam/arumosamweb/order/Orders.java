package com.arumosam.arumosamweb.order;

import com.arumosam.arumosamweb.item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int orderNo;
	private int waybillid;
	private String customerName;
	private String address1;
	private String address2;
	private String description;
	private Item[] items;
	private double totPrice;
	
	public Orders() {
		
	}
	
	public Orders(String customerName, String address1, String address2, String description, Item []items, double totPrice) {
		super();
		this.customerName = customerName;
		this.address1 = address1;
		this.address2 = address2;
		this.description = description;
		this.items = items;
		this.totPrice = totPrice;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getWaybillid() {
		return waybillid;
	}

	public void setWaybillid(int waybillid) {
		this.waybillid = waybillid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public double getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(double totPrice) {
		this.totPrice = totPrice;
	}
}
