package com.azevedoedison.paymentservice.service;

import com.azevedoedison.paymentservice.model.Payment;

public interface PaymentService {

	void sendPayment(Payment payment);
}
