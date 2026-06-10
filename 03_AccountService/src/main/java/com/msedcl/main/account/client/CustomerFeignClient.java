package com.msedcl.main.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.msedcl.main.account.common.ApiResponse;
import com.msedcl.main.account.dto.CustomerResponseDTO;

@FeignClient(name = "CustomerService", path = "/customerapi/")
public interface CustomerFeignClient {

	@GetMapping("/customers/{customerId}")
	public ResponseEntity<ApiResponse<CustomerResponseDTO>> getSingleCustomer(@PathVariable int customerId);
}
