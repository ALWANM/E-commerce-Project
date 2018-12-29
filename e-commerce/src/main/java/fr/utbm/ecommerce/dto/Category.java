package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDCATEGORY")
	private int CategoryID;
	@Column(name="NAME")
	private String Name;
	@Column(name="DESCRIPTION")
	private String Description;
	public int getIDCATEGORY() {
		return CategoryID;
	}
	public void setIDCATEGORY(int iDCATEGORY) {
		CategoryID = iDCATEGORY;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDecsription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Category [IDCATEGORY=" + CategoryID + ", Name=" + Name + ", Description=" + Description + "]";
	}
	public Category(String name, String description) {
		super();
		Name = name;
		Description = description;
	}
	
	public Category() {
		super();
	}
}
