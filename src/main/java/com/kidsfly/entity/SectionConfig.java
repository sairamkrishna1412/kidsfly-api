package com.kidsfly.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @ElementCollection
    @Column(name = "product_ids")
    private List<Integer> productIds;

    @ElementCollection
    @Column(name = "category_ids")
    private List<Integer> categoryIds;

    @Column(name = "section_type")
    private SectionType sectionType;

    @Column(name = "order_position")
    private Integer orderPosition;

    @Column(name = "image_path")
    private String imagePath;

    // Getters and setters
}