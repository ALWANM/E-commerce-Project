package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplierid")
	private String supplierID;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="town")
	private String town;
	
	@Column(name="postalcode")
	private String postalCode;
	
	@Column(name="country")
	private String country;

	public Supplier(String supplierID, String name, String address, String town, String postalCode, String country) {
		this.supplierID = supplierID;
		this.name = name;
		this.address = address;
		this.town = town;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Supplier [supplierID=" + supplierID + ", name=" + name + ", address=" + address + ", town=" + town
				+ ", postalCode=" + postalCode + ", country=" + country + "]";
	}
	
	
}
