package com.javatechie.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
	
	private String transactionId;
	private String srcAc;
	private String destAc;
	private double amount;
	private Date txDate;

}
