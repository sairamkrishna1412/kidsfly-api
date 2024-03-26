package com.kidsfly.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class SectionConfigProductJunctionId {
	@Column(name = "section_id")
	private Integer sectionId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	/**
	 * @return the sectionId
	 */
	public Integer getSectionId() {
		return sectionId;
	}

	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, sectionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SectionConfigProductJunctionId other = (SectionConfigProductJunctionId) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(sectionId, other.sectionId);
	}
}
