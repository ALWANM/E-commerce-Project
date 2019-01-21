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
import javax.validation.constraints.NotNull;

/**
 * Entity carteitem
 *
 */
@Entity
@Table(name = "carteitem")
public class CartItem implements Serializable{

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARTEITEMID")
	private int CarteitemID;
	@Column(name = "QUANTITY")
	private int Quantity;
	@ManyToOne 
	@JoinColumn(name = "ORDERID")
	private Order Order;
	/*
	 * to define the mapping between class cartitem and product
	 * */
	@ManyToOne
	@JoinColumn(name = "PRODUCTID")
	private Product Product;
	
	/**Getters and Setters**/
	
	/**
	 * Gets the cart item id
	 * @return carteitemid
	 */
	public int getCarteitemID() {
		return CarteitemID;
	}
	
	/**
	 * Sets the cart item id
	 * @param carteitemID the id
	 */
	public void setCarteitemID(int carteitemID) {
		CarteitemID = carteitemID;
	}
	
	/**
	 * Gets the quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return Quantity;
	}
	
	/**
	 * Sets the quantity
	 * @param quantity the quantity
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	/**
	 * Gets the order id
	 * @return order
	 */
	public Order getOrder() {
		return Order;
	}
	
	/**
	 * Sets the order id
	 * @param order the object order
	 */
	public void setOrder(Order order) {
		Order = order;
	}
	
	/**
	 * Gets the product
	 * @return the product
	 */
	public Product getProduct() {
		return Product;
	}
	
	/**
	 * Sets the product
	 * @param product the object product
	 */
	public void setProduct(Product product) {
		Product = product;
	}

	@Override
	public String toString() {
		return "CartItem [CarteitemID=" + CarteitemID + ", Quantity=" + Quantity + ", Order=" + Order + ", Product="
				+ Product + "]";
	}

	/**
	 * Default constructor
	 * @param quantity the quantity
	 * @param order the order id
	 * @param product the product id
	 */
	public CartItem(int quantity, fr.utbm.ecommerce.dto.@NotNull Order order,
			fr.utbm.ecommerce.dto.@NotNull Product product) {
		super();
		Quantity = quantity;
		Order = order;
		Product = product;
	}

	/**
	 * Default constructor
	 */
	public CartItem() {
		super();
	}
}
