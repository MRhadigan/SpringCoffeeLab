package com.springlab.entity;

public class Items {
	private String itemID;
	private String Name;
	private String description;
	private String quantity;
	private String price;
	
	public Items() {
		itemID = "";
		Name = "";
		description = "";
		quantity = "";
		price = "";
		
		
	}

	public Items(String itemID, String name, String description, String quantity, String price) {
		super();
		this.itemID = itemID;
		Name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "itemID=" + itemID + ", Name=" + Name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price;
	}
	
	
}
