package com.msedcl.main.transaction.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponseDTO {
	private int transactionId;
	private AccountResponseDTO account;
	private String transactionType;
	private double amount;
	private LocalDate transactionDate;
}
