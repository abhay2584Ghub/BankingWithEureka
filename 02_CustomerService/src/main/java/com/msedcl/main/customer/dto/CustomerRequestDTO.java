package com.msedcl.main.customer.dto;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
		name = "Customer",
		description = "Schema to hold Customer Information"
		)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {
	
	@Schema(
			description = "Customer Name", example = "Reema")
	@NotBlank(message = "Name cannot be blank")
	@Length(min=2, max=50)
	private String name;
	
	@Schema(description = "Customers Email Address", example = "reema@msedcl.com")
	@Email(message="Invalid EmailId")
	@NotBlank(message="email can not be balnk")
	@Length(min=10, max=50)
	private String email;
	
	@Schema(description = "Customers Mobile Number", example = "9876543210")
	@NotBlank(message="Mobile number cannot be blank")
	@Length(min=10, max=13)
	private String mobileNumber;
}
