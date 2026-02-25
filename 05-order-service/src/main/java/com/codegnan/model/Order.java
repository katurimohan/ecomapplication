package com.codegnan.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private BigDecimal totalPrice;
    private String status;
    private LocalDateTime placedAt = LocalDateTime.now();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    // ===== GETTERS =====

    public Long getId() {
        return id;
    }

    public Long getUserId() {     
        return userId;
    }

    public BigDecimal getTotalPrice() {  
        return totalPrice;
    }

    public String getStatus() {           
        return status;
    }

    public LocalDateTime getPlacedAt() {  
        return placedAt;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    // ===== SETTERS =====

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlacedAt(LocalDateTime placedAt) {
        this.placedAt = placedAt;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}