package com.kidsfly.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="section_config_product_junction")
public class SectionConfigProductJunction {
	@EmbeddedId
	private SectionConfigProductJunctionId id;	
	
	@ManyToOne
	@MapsId("sectionId")
	@JoinColumn(name = "section_id")
	private SectionConfig sectionConfig;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;
	
	

	/**
	 * @return the id
	 */
	public SectionConfigProductJunctionId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(SectionConfigProductJunctionId id) {
		this.id = id;
	}

	/**
	 * @return the sectionConfig
	 */
	public SectionConfig getSectionConfig() {
		return sectionConfig;
	}

	/**
	 * @param sectionConfig the sectionConfig to set
	 */
	public void setSectionConfig(SectionConfig sectionConfig) {
		this.sectionConfig = sectionConfig;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
