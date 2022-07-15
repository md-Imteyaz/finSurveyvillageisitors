package com.Villagevisitors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Village_visitors")
public class Village_Visitors {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private int village;
	@Column
	private int district;
	@Column
	private int block;
	@Column
	private long pincode;
	@Column
	private int village_image;
	@Column
	private String contact_person;
	@Column
	private long contact_number;
	@Column
	private int no_of_households;
	@Column
	private int number_of_kirana_shops;
	@Column
	private int number_of_cosmetics_shops;
	@Column
	private int number_of_tea_small_eatries_shops;
	@Column
	private int number_of_other_shops;
	@Column
	private int number_of_milk_call_centers;
	@Column
	private int activities;
	@Column
	private int banking_and_lending_institutions;
	@Column
	private int suitable_for_pragati_operations_and_no_of_clients;
	@OneToOne
	private BankAndLendingIntitutions bankandlendingintitutions;

	public Village_Visitors(int id, int village, int district, int block, long pincode, int village_image,
			String contact_person, long contact_number, int no_of_households, int number_of_kirana_shops,
			int number_of_cosmetics_shops, int number_of_tea_small_eatries_shops, int number_of_other_shops,
			int number_of_milk_call_centers, int activities, int banking_and_lending_institutions,
			int suitable_for_pragati_operations_and_no_of_clients,
			BankAndLendingIntitutions bankandlendingintitutions) {
		super();
		this.id = id;
		this.village = village;
		this.district = district;
		this.block = block;
		this.pincode = pincode;
		this.village_image = village_image;
		this.contact_person = contact_person;
		this.contact_number = contact_number;
		this.no_of_households = no_of_households;
		this.number_of_kirana_shops = number_of_kirana_shops;
		this.number_of_cosmetics_shops = number_of_cosmetics_shops;
		this.number_of_tea_small_eatries_shops = number_of_tea_small_eatries_shops;
		this.number_of_other_shops = number_of_other_shops;
		this.number_of_milk_call_centers = number_of_milk_call_centers;
		this.activities = activities;
		this.banking_and_lending_institutions = banking_and_lending_institutions;
		this.suitable_for_pragati_operations_and_no_of_clients = suitable_for_pragati_operations_and_no_of_clients;
		this.bankandlendingintitutions = bankandlendingintitutions;
	}

	public BankAndLendingIntitutions getBankandlendingintitutions() {
		return bankandlendingintitutions;
	}

	public void setBankandlendingintitutions(BankAndLendingIntitutions bankandlendingintitutions) {
		this.bankandlendingintitutions = bankandlendingintitutions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVillage() {
		return village;
	}

	public void setVillage(int village) {
		this.village = village;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public int getVillage_image() {
		return village_image;
	}

	public void setVillage_image(int village_image) {
		this.village_image = village_image;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public int getNo_of_households() {
		return no_of_households;
	}

	public void setNo_of_households(int no_of_households) {
		this.no_of_households = no_of_households;
	}

	public int getNumber_of_kirana_shops() {
		return number_of_kirana_shops;
	}

	public void setNumber_of_kirana_shops(int number_of_kirana_shops) {
		this.number_of_kirana_shops = number_of_kirana_shops;
	}

	public int getNumber_of_cosmetics_shops() {
		return number_of_cosmetics_shops;
	}

	public void setNumber_of_cosmetics_shops(int number_of_cosmetics_shops) {
		this.number_of_cosmetics_shops = number_of_cosmetics_shops;
	}

	public int getNumber_of_tea_small_eatries_shops() {
		return number_of_tea_small_eatries_shops;
	}

	public void setNumber_of_tea_small_eatries_shops(int number_of_tea_small_eatries_shops) {
		this.number_of_tea_small_eatries_shops = number_of_tea_small_eatries_shops;
	}

	public int getNumber_of_other_shops() {
		return number_of_other_shops;
	}

	public void setNumber_of_other_shops(int number_of_other_shops) {
		this.number_of_other_shops = number_of_other_shops;
	}

	public int getNumber_of_milk_call_centers() {
		return number_of_milk_call_centers;
	}

	public void setNumber_of_milk_call_centers(int number_of_milk_call_centers) {
		this.number_of_milk_call_centers = number_of_milk_call_centers;
	}

	public int getActivities() {
		return activities;
	}

	public void setActivities(int activities) {
		this.activities = activities;
	}

	public int getBanking_and_lending_institutions() {
		return banking_and_lending_institutions;
	}

	public void setBanking_and_lending_institutions(int banking_and_lending_institutions) {
		this.banking_and_lending_institutions = banking_and_lending_institutions;
	}

	public int getSuitable_for_pragati_operations_and_no_of_clients() {
		return suitable_for_pragati_operations_and_no_of_clients;
	}

	public void setSuitable_for_pragati_operations_and_no_of_clients(
			int suitable_for_pragati_operations_and_no_of_clients) {
		this.suitable_for_pragati_operations_and_no_of_clients = suitable_for_pragati_operations_and_no_of_clients;
	}

	public Village_Visitors(int id, int village, int district, int block, long pincode, int village_image,
			String contact_person, long contact_number, int no_of_households, int number_of_kirana_shops,
			int number_of_cosmetics_shops, int number_of_tea_small_eatries_shops, int number_of_other_shops,
			int number_of_milk_call_centers, int activities, int banking_and_lending_institutions,
			int suitable_for_pragati_operations_and_no_of_clients) {
		super();
		this.id = id;
		this.village = village;
		this.district = district;
		this.block = block;
		this.pincode = pincode;
		this.village_image = village_image;
		this.contact_person = contact_person;
		this.contact_number = contact_number;
		this.no_of_households = no_of_households;
		this.number_of_kirana_shops = number_of_kirana_shops;
		this.number_of_cosmetics_shops = number_of_cosmetics_shops;
		this.number_of_tea_small_eatries_shops = number_of_tea_small_eatries_shops;
		this.number_of_other_shops = number_of_other_shops;
		this.number_of_milk_call_centers = number_of_milk_call_centers;
		this.activities = activities;
		this.banking_and_lending_institutions = banking_and_lending_institutions;
		this.suitable_for_pragati_operations_and_no_of_clients = suitable_for_pragati_operations_and_no_of_clients;
	}

	public Village_Visitors() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Village_Vistors [id=" + id + ", village=" + village + ", district=" + district + ", block=" + block
				+ ", pincode=" + pincode + ", village_image=" + village_image + ", contact_person=" + contact_person
				+ ", contact_number=" + contact_number + ", no_of_households=" + no_of_households
				+ ", number_of_kirana_shops=" + number_of_kirana_shops + ", number_of_cosmetics_shops="
				+ number_of_cosmetics_shops + ", number_of_tea_small_eatries_shops=" + number_of_tea_small_eatries_shops
				+ ", number_of_other_shops=" + number_of_other_shops + ", number_of_milk_call_centers="
				+ number_of_milk_call_centers + ", activities=" + activities + ", banking_and_lending_institutions="
				+ banking_and_lending_institutions + ", suitable_for_pragati_operations_and_no_of_clients="
				+ suitable_for_pragati_operations_and_no_of_clients + ", bankandlendingintitutions="
				+ bankandlendingintitutions + "]";
	}

}
