package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * to define the entity 
 * */
@Entity
@Table(name="category")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDCATEGORY")
	private int CategoryID;
	@Column(name="NAME")
	private String Name;
	@Column(name="DESCRIPTION")
	private String Description;
	
	
	/**Getters and Setters**/
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Category [IDCATEGORY=" + CategoryID + ", Name=" + Name + ", Description=" + Description + "]";
	}
	/*
	 *  constructor
	 * */
	public Category(String name, String description) {
		super();
		Name = name;
		Description = description;
	}
	
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getDescription() {
		return Description;
	}
	/*
	 * default constructor
	 * */
	public Category() {
		super();
	}
}
