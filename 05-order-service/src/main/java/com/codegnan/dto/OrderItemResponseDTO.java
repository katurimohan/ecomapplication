package com.codegnan.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemResponseDTO {
public Long getProductId() {
		return productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
private Long productId;
private Integer quantity;
private BigDecimal price;
}
