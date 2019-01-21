package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entity product
 *
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCTID")
	private int ProductID;
	@Column(name = "REFERENCE")
	private String Reference;
	@Column(name = "NAME")
	private String Name;
	@Column(name = "DESCRIPTION")
	private String Description;
	@Column(name = "PRICE")
	private float Price;
	@Column(name = "VAT")
	private float Vat;
	@Column(name = "QUANTITYSTOCK")
	private int QuantityStock;
	@Column(name = "SIZE")
	private int Size;
	@Column(name = "COLOR")
	private String Color;
	@Column(name = "PICTURE")
	private String Picture; 
	/*
	 * to define the mapping between class product and supplier
	 * */
	@OneToOne
	@JoinColumn(name = "SUPPLIERID")
	private Supplier Supplier;
	/*
	 * to define the mapping between class product and category
	 * */
	@OneToOne
	@JoinColumn(name = "IDCATEGORY")
	private Category Category;
	
	
	/**Getters and Setters**/
	
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", Reference=" + Reference + ", Description=" + Description
				+ ", Price=" + Price + ", Vat=" + Vat + ", QuantityStock=" + QuantityStock + ", Size=" + Size
				+ ", Color=" + Color + ", Picture=" + Picture + ", Supplier=" + Supplier + ", Category=" + Category
				+ ", Name = "+ Name +"]";
	}
	
	/** Gets the product id
	 * @return the productID
	 */
	public int getProductID() {
		return ProductID;
	}
	/**
	 * Sets the product id
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		ProductID = productID;
	}
	/**
	 * Gets the reference product
	 * @return the reference
	 */
	public String getReference() {
		return Reference;
	}
	/**
	 * Sets the reference product
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		Reference = reference;
	}
	/**
	 * Gets the name product
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * Sets the product name
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * Gets the description
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * Sets the description
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * Gets the price product
	 * @return the price
	 */
	public float getPrice() {
		return Price;
	}
	/**
	 * Sets the price product
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		Price = price;
	}
	/**
	 * Gets the VAT 
	 * @return the vat
	 */
	public float getVat() {
		return Vat;
	}
	/**
	 * Sets the VAT
	 * @param vat the vat to set
	 */
	public void setVat(float vat) {
		Vat = vat;
	}
	/**
	 * Get the stock quantity
	 * @return the quantityStock
	 */
	public int getQuantityStock() {
		return QuantityStock;
	}
	/**
	 * Sets the stock quantity
	 * @param quantityStock the quantityStock to set
	 */
	public void setQuantityStock(int quantityStock) {
		QuantityStock = quantityStock;
	}
	/**
	 * Gets the size
	 * @return the size
	 */
	public int getSize() {
		return Size;
	}
	/**
	 * Sets the size
	 * @param size the size to set
	 */
	public void setSize(int size) {
		Size = size;
	}
	/**
	 * Gets the color
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * Sets the color
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}
	/**
	 * Gets the picture name
	 * @return the picture
	 */
	public String getPicture() {
		return Picture;
	}
	/**
	 * Sets the picture name
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		Picture = picture;
	}
	/**
	 * Gets the supplier
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return Supplier;
	}
	/**
	 * Sets the supplier
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		Supplier = supplier;
	}
	/**
	 * Gets the category
	 * @return the category
	 */
	public Category getCategory() {
		return Category;
	}
	/**
	 * Sets the category
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		Category = category;
	}

	/**
	 * Default constructor
	 * @param reference the reference
	 * @param name the name
	 * @param description the description
	 * @param price the price
	 * @param vat the vat
	 * @param quantityStock the quantity stock
	 * @param size the size
	 * @param color the color
	 * @param picture the picture name
	 * @param supplier the supplier
	 * @param category the category
	 */
	public Product(String reference, String name, String description, float price, float vat, int quantityStock, int size, String color,
			String picture, fr.utbm.ecommerce.dto.@NotNull Supplier supplier,
			fr.utbm.ecommerce.dto.@NotNull Category category) {
		super();
		Reference = reference;
		Description = description;
		Price = price;
		Vat = vat;
		QuantityStock = quantityStock;
		Size = size;
		Color = color;
		Picture = picture;
		Supplier = supplier;
		Category = category;
		Name = name;
	}
	
	/**
	 * Default constructor
	 */
	public Product() {
		super();
	}
	
}
