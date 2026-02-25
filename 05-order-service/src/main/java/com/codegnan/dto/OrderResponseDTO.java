package com.codegnan.dto;

import java.math.BigDecimal; 

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.codegnan.dto.UserDto;

@Getter
@Setter
public class OrderResponseDTO {
	

	    private Long orderId;
	    private UserDto userDto;
	    private List<OrderItemResponseDTO> items;

	    // Permanent manual methods

	    public void setOrderId(Long orderId) {
	        this.orderId = orderId;
	    }

	    public Long getOrderId() {
	        return orderId;
	    }

	    public void setUserDto(UserDto userDto) {
	        this.userDto = userDto;
	    }

	    public UserDto getUserDto() {
	        return userDto;
	    }

	    public void setItems(List<OrderItemResponseDTO> items) {
	        this.items = items;
	    }

	    public List<OrderItemResponseDTO> getItems() {
	        return items;
	    }
	}

