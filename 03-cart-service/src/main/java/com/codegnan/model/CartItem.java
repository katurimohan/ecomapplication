package com.codegnan.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cart_items")
@Setter
@Getter
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	public LocalDateTime getAddedAt() {
		return addedAt;
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
	public void setAddedAt(LocalDateTime addedAt) {
		this.addedAt = addedAt;
	}
	private Long userId;
	private Long productId;
	private Integer quantity;
	private LocalDateTime addedAt = LocalDateTime.now();
}














