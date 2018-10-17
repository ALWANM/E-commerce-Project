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
@Table(name="product")
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private int productID;
	
	@Column(name="reference")
	private String reference;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;
	
	@Column(name="price")
	private float price;
	
	@Column(name="vat")
	private float vat;
	
	@Column(name="quantitystock")
	private int quantityStock;
	
	@ManyToOne
	@JoinColumn(name="supplierid")
	private Supplier supplier;


	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public Product(int productID, String reference, String name, String description, Category category, float price,
			float vat, int quantityStock, Supplier supplier) {
		super();
		this.productID = productID;
		this.reference = reference;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.vat = vat;
		this.quantityStock = quantityStock;
		this.supplier = supplier;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getVat() {
		return vat;
	}

	public void setVat(float vat) {
		this.vat = vat;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product [reference=" + reference + ", name=" + name + ", description=" + description + ", category="
				+ category + ", price=" + price + ", vat=" + vat + ", quantityStock=" + quantityStock + ", supplier="
				+ supplier + "]";
	}

	
}
