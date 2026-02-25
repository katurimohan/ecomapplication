package com.codegnan.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemResponseDTO {

	public Long getId() {
		return id;
	}
	public Long getUserId() {
		return userId;
	}
	public Long getProductId() {
		return productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setId(Long id) {
		this.id = id;
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
	private Long id;
	private Long userId;
	private Long productId;
	private Integer quantity;
}
