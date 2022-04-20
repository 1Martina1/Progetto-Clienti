package it.reply.customerbff.entity;

import java.util.List;

public class DetailedCustomer {
	private int id;
	private String name;
	private String surname;
	private String address;
	private String fiscalCode;
	private String birth_date;
	
	private List<DetailedContact> contacts;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public List<DetailedContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<DetailedContact> contacts) {
		this.contacts = contacts;
	}

	
	
	
}
