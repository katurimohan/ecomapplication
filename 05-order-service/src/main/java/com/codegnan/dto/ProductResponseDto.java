package com.codegnan.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ProductResponseDto {
	public BigDecimal getPrice() {
	    return price;
	}
    public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
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
	private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}