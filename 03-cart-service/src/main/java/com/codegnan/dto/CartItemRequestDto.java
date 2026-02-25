package com.codegnan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartItemRequestDto {

	private Long userId;
	public Long getUserId() {
		return userId;
	}
	public Long getProductId() {
		return productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	private Long productId;
	private Integer quantity;
}
