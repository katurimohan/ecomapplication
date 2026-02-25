package com.codegnan.dto;

import java.math.BigDecimal; 

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductResponseDto {

	private Long id;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	private String name;
	private String description;
	private BigDecimal price;
	private Integer stock;
	
}
