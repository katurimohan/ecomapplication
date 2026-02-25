package com.codegnan.controller;

import org.springframework.web.bind.annotation.PostMapping; 

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.dto.PaymentRequestDTO;
import com.codegnan.dto.PaymentResponseDTO;
import com.codegnan.service.PaymentService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/payments")
@AllArgsConstructor

public class PaymentController {
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);
	private PaymentService paymentService;

	@PostMapping
	public PaymentResponseDTO makePayment(@RequestBody PaymentRequestDTO request) {

		log.info("PaymentController :: makePayment() called for OrderId: {}", request.getOrderId());
		log.debug("Incoming payment amount: {}", request.getAmount());

		PaymentResponseDTO response = paymentService.processPayment(request);

		log.info("PaymentController :: makePayment() completed successfully");

		return response;
	}
}
