package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Salesman_details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer salesmanId;

	private String salesmanName;

	private String salesmanAdd;
	
	private String bookName;
	
	private String bookSub;
	
	private String bookClass;

	public Integer getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(Integer salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	public String getSalesmanAdd() {
		return salesmanAdd;
	}

	public void setSalesmanAdd(String salesmanAdd) {
		this.salesmanAdd = salesmanAdd;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookSub() {
		return bookSub;
	}

	public void setBookSub(String bookSub) {
		this.bookSub = bookSub;
	}

	public String getBookClass() {
		return bookClass;
	}

	public void setBookClass(String bookClass) {
		this.bookClass = bookClass;
	}

	@Override
	public String toString() {
		return "Salesman_details [salesmanId=" + salesmanId + ", salesmanName=" + salesmanName + ", salesmanAdd="
				+ salesmanAdd + ", bookName=" + bookName + ", bookSub=" + bookSub + ", bookClass=" + bookClass + "]";
	}

	public Salesman_details(Integer salesmanId, String salesmanName, String salesmanAdd, String bookName,
			String bookSub, String bookClass) {
		super();
		this.salesmanId = salesmanId;
		this.salesmanName = salesmanName;
		this.salesmanAdd = salesmanAdd;
		this.bookName = bookName;
		this.bookSub = bookSub;
		this.bookClass = bookClass;
	}

	public Salesman_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
