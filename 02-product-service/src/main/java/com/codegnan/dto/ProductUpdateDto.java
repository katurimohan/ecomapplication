package com.codegnan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductUpdateDto {

	private Long id;
	public Long getId() {
		return id;
	}
	public Integer getStock() {
		return stock;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	private Integer stock;
}
