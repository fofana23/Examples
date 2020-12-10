package com.fofana23.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fofana23.bank.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
