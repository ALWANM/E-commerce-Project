package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entity category
 *
 */
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
	
	/**
	 * Gets the name
	 * @return name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * Sets the name
	 * @param name the name
	 */
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Category [IDCATEGORY=" + CategoryID + ", Name=" + Name + ", Description=" + Description + "]";
	}

	/**
	 * Default constructor
	 * @param name the name
	 * @param description the description
	 */
	public Category(String name, String description) {
		super();
		Name = name;
		Description = description;
	}
	
	/**
	 * Gets the id
	 * @return category id
	 */
	public int getCategoryID() {
		return CategoryID;
	}
	/**
	 * Sets the id
	 * @param categoryID the id
	 */
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	/**
	 * Sets the description
	 * @param description the description
	 */
	public void setDescription(String description) {
		Description = description;
	}
	
	/**
	 * Gets the description
	 * @return description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * Default constructor
	 */
	public Category() {
		super();
	}
}
