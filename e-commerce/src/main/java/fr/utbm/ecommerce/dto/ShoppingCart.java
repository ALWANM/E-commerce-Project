package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shoppingcart")
public class ShoppingCart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idshoppingcart")
	private int idcart;
	
	@OneToMany(mappedBy="ShoppingCart", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<LineProduct> lineProducts = new ArrayList<>();
	
	public int getIdcart() {
		return idcart;
	}

	public void setIdcart(int idcart) {
		this.idcart = idcart;
	}

	public ShoppingCart(int idcart) {
		this.idcart = idcart;
	}

	public List<LineProduct> getLineProduct() {
		return lineProducts;
	}

	public void setLineProduct(List<LineProduct> lineProducts) {
		this.lineProducts = lineProducts;
	}

	@Override
	public String toString() {
		return "ShoppingCart [idcart=" + idcart + ", lineProduct=" + lineProducts + "]";
	}
}
