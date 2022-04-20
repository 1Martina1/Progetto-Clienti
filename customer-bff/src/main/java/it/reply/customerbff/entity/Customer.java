package it.reply.customerbff.entity;

import java.io.Serializable;
import java.util.List;

public class Customer {
	public Customer() {}
		private int id;
		private String name;
		private String surname;
		private String address;
		private String fiscalCode;
		private String birth_date;
		
		private List<Contact> contacts;
		
		public List<Contact> getContacts() {
			return contacts;
		}
		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}
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
		
	
}
