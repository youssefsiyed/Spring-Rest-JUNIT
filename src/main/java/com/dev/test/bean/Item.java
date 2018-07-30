package com.dev.test.bean;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
	@Id
	//@GeneratedValue
	private int idItem;
	private String nameItem;
	private int priceItem;
	private int quantiyItem;
	
	@Transient
	private int value;
	
	///////////////////////////////////////
	public Item(){
		
	}
	/////////////////////////////////////////////////
	public Item(int idItem, String nameItem, int priceItem, int quantiyItem) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.priceItem = priceItem;
		this.quantiyItem = quantiyItem;
	}
	////////////////////////////////////////////////////
	
	public int getIdItem() {
		return idItem;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getNameItem() {
		return nameItem;
	}
	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}
	public int getPriceItem() {
		return priceItem;
	}
	public void setPriceItem(int priceItem) {
		this.priceItem = priceItem;
	}
	public int getQuantiyItem() {
		return quantiyItem;
	}
	public void setQuantiyItem(int quantiyItem) {
		this.quantiyItem = quantiyItem;
	}
	
	
	
}
