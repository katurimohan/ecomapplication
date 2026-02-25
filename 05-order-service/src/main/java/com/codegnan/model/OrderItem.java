package com.codegnan.model;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_items")


public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    public Long getId() {
		return id;
	}
	public Long getProductId() {
		return productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public Order getOrder() {
		return order;
	}
	public void setId(Long id) {
		this.id = id;
	}

	private Integer quantity;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // manual setter (important)
    public void setOrder(Order order) {
        this.order = order;
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
}