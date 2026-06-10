package com.msedcl.main.transaction.mapper;

import com.msedcl.main.transaction.dto.TransactionRequestDTO;
import com.msedcl.main.transaction.dto.TransactionResponseDTO;
import com.msedcl.main.transaction.entity.Transactions;

public class TransactionMapper {

	public static Transactions toEntity(TransactionRequestDTO dto, String type) {

		Transactions transaction = new Transactions();

		transaction.setAccountId(dto.getAccountId());
		transaction.setAmount(dto.getAmount());
		transaction.setTransactionType(type);

		return transaction;
	}

	public static TransactionResponseDTO toDTO(Transactions transaction) {

		return new TransactionResponseDTO(transaction.getTransactionId(), null, transaction.getTransactionType(),
				transaction.getAmount(), transaction.getTransactionDate());
	}
}