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
	@Column(name="CATEGORYID")
	private int CategoryID;
	@Column(name="NAME")
	private String Name;
	@Column(name="DESCRIPTION")
	private String Decsription;
	 
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDecsription() {
		return Decsription;
	}
	public void setDecsription(String decsription) {
		Decsription = decsription;
	}
	@Override
	public String toString() {
		return "Category [IDCATEGORY=" + CategoryID + ", Name=" + Name + ", Decsription=" + Decsription + "]";
	}
	public Category() {
		super();
	}
	public Category(String name, String decsription) {
		super();
		Name = name;
		Decsription = decsription;
	}
	
}
