package it.reply.test.customerapi.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Contact")
public class Contact{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne 
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;
	
	@Column(name = "type")
	private String type;

	@Column(name = "val")
	private String val;

	@Column(name = "certified")
	private boolean certified;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public boolean isCertified() {
		return certified;
	}

	public void setCertified(boolean certified) {
		this.certified = certified;
	}

}
