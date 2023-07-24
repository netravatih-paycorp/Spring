package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phno;
	private String email;
	@OneToOne
	private AdhaarCard card;
	
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AdhaarCard getCard() {
		return card;
	}
	public void setCard(AdhaarCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + ", card=" + card + "]";
	}

	
 
}
