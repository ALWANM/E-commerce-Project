package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lineproduct")
public class LineProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="idshoppingcart")
	private ShoppingCart shopping;
	
	@ManyToOne
	@JoinColumn(name="reference")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;

	public LineProduct(ShoppingCart shopping, Product product, int quantity) {
		super();
		this.shopping = shopping;
		this.product = product;
		this.quantity = quantity;
	}

	public ShoppingCart getShopping() {
		return shopping;
	}

	public void setShopping(ShoppingCart shopping) {
		this.shopping = shopping;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineProduct [shopping=" + shopping + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	
}
