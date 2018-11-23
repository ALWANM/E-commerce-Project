package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "SUPPLIERID")
	private Supplier Supplier;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORYID")
	private Category Category;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public float getVat() {
		return Vat;
	}
	public void setVat(float vat) {
		Vat = vat;
	}
	public int getQuantityStock() {
		return QuantityStock;
	}
	public void setQuantityStock(int quantityStock) {
		QuantityStock = quantityStock;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public Supplier getSupplier() {
		return Supplier;
	}
	public void setSupplier(Supplier supplier) {
		Supplier = supplier;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", Reference=" + Reference + ", Description=" + Description
				+ ", Price=" + Price + ", Vat=" + Vat + ", QuantityStock=" + QuantityStock + ", Size=" + Size
				+ ", Color=" + Color + ", Picture=" + Picture + ", Supplier=" + Supplier + ", Category=" + Category
				+ "]";
	}
	public Product(String reference, String description, float price, float vat, int quantityStock, int size, String color,
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
	}
	
}
