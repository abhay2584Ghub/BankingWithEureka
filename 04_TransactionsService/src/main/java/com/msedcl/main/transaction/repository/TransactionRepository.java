package com.msedcl.main.transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msedcl.main.transaction.entity.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {
	List<Transactions> findByAccountId(Integer accountId);

}
