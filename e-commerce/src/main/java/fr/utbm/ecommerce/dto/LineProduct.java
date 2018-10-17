package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private int lineproductid;
	
	@ManyToOne
	@JoinColumn(name="idshoppingcart")
	private ShoppingCart shopping;
	
	@ManyToOne
	@JoinColumn(name="productid")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;

	public LineProduct(int lineproductid, ShoppingCart shopping, Product product, int quantity) {
		super();
		this.lineproductid = lineproductid;
		this.shopping = shopping;
		this.product = product;
		this.quantity = quantity;
	}

	public int getLineproductid() {
		return lineproductid;
	}

	public void setLineproductid(int lineproductid) {
		this.lineproductid = lineproductid;
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
		return "LineProduct [lineproductid=" + lineproductid + ", shopping=" + shopping + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}
	
	
}
