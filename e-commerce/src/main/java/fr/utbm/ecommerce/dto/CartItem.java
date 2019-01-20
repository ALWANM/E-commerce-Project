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
/*
 * to define the entity 
 * */
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
	
	public int getCarteitemID() {
		return CarteitemID;
	}
	public void setCarteitemID(int carteitemID) {
		CarteitemID = carteitemID;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Order getOrder() {
		return Order;
	}
	public void setOrder(Order order) {
		Order = order;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
	/*
	 * to string method to print the object java
	 * */
	@Override
	public String toString() {
		return "CartItem [CarteitemID=" + CarteitemID + ", Quantity=" + Quantity + ", Order=" + Order + ", Product="
				+ Product + "]";
	}
	/*
	 * constructor
	 * */
	public CartItem(int quantity, fr.utbm.ecommerce.dto.@NotNull Order order,
			fr.utbm.ecommerce.dto.@NotNull Product product) {
		super();
		Quantity = quantity;
		Order = order;
		Product = product;
	}
	/*
	 * default constructor
	 * */

	public CartItem() {
		super();
	}
}
