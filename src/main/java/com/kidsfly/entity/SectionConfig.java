package com.kidsfly.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "section_config")
public class SectionConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;
    
    @ManyToMany
    @JoinTable(
	 name = "section_config_product_junction",
	 joinColumns = @JoinColumn(name = "section_id"),
	 inverseJoinColumns = @JoinColumn(name = "product_id")
	)
    private Set<Product> products;

    @Column(name = "product_ids")
    private List<Integer> productIds;

    @Column(name = "category_ids")
    private List<Integer> categoryIds;

    @Column(name = "section_type")
    @Enumerated(EnumType.STRING)
    private SectionType sectionType;

    @Column(name = "order_position")
    private Integer orderPosition;

    @Column(name = "image_path")
    private String imagePath;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 * @return the productIds
	 */
	public List<Integer> getProductIds() {
		return productIds;
	}

	/**
	 * @param productIds the productIds to set
	 */
	public void setProductIds(List<Integer> productIds) {
		this.productIds = productIds;
	}

	/**
	 * @return the categoryIds
	 */
	public List<Integer> getCategoryIds() {
		return categoryIds;
	}

	/**
	 * @param categoryIds the categoryIds to set
	 */
	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}

	/**
	 * @return the sectionType
	 */
	public SectionType getSectionType() {
		return sectionType;
	}

	/**
	 * @param sectionType the sectionType to set
	 */
	public void setSectionType(SectionType sectionType) {
		this.sectionType = sectionType;
	}

	/**
	 * @return the orderPosition
	 */
	public Integer getOrderPosition() {
		return orderPosition;
	}

	/**
	 * @param orderPosition the orderPosition to set
	 */
	public void setOrderPosition(Integer orderPosition) {
		this.orderPosition = orderPosition;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}