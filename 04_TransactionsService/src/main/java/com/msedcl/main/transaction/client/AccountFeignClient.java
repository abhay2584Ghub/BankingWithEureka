package com.msedcl.main.transaction.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.msedcl.main.transaction.common.ApiResponse;
import com.msedcl.main.transaction.dto.AccountResponseDTO;

@FeignClient(name = "AccountService", path = "/accountapi/")
public interface AccountFeignClient {
	@GetMapping("accounts/account/{accountId}")
	public ResponseEntity<ApiResponse<AccountResponseDTO>> getAccountById(@PathVariable int accountId);
}
