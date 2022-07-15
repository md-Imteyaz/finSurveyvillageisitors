package com.Villagevisitors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "banking_and_lending_institutions")
public class BankAndLendingIntitutions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private int client;
	@OneToOne(mappedBy = "bankandlendingintitutions")
	private Village_Visitors village_Vistors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public Village_Visitors getVillage_Vistors() {
		return village_Vistors;
	}

	public void setVillage_Vistors(Village_Visitors village_Vistors) {
		this.village_Vistors = village_Vistors;
	}

	@Override
	public String toString() {
		return "BankAndLendingIntitutions [id=" + id + ", name=" + name + ", type=" + type + ", client=" + client
				+ ", village_Vistors=" + village_Vistors + "]";
	}

	public BankAndLendingIntitutions(int id, String name, String type, int client, Village_Visitors village_Vistors) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.client = client;
		this.village_Vistors = village_Vistors;
	}

	public BankAndLendingIntitutions() {
		super();
		// TODO Auto-generated constructor stub
	}

}
