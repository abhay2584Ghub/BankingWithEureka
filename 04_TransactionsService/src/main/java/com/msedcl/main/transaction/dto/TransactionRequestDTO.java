package com.msedcl.main.transaction.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

	@Data
	public class TransactionRequestDTO {

		@NotNull
		private int accountId;

		@NotNull
		private double amount;
}
