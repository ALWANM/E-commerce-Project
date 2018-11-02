package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="supplier")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDCATEGORY")
	private int IDCATEGORY;
	@Column(name="NAME")
	private int Name;
	@Column(name="DESCRIPTION")
	private int Decsription;
	public int getIDCATEGORY() {
		return IDCATEGORY;
	}
	public void setIDCATEGORY(int iDCATEGORY) {
		IDCATEGORY = iDCATEGORY;
	}
	public int getName() {
		return Name;
	}
	public void setName(int name) {
		Name = name;
	}
	public int getDecsription() {
		return Decsription;
	}
	public void setDecsription(int decsription) {
		Decsription = decsription;
	}
	@Override
	public String toString() {
		return "Category [IDCATEGORY=" + IDCATEGORY + ", Name=" + Name + ", Decsription=" + Decsription + "]";
	}
	public Category(int name, int decsription) {
		super();
		Name = name;
		Decsription = decsription;
	}
	
}
