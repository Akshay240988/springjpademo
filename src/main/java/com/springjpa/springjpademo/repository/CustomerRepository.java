package com.springjpa.springjpademo.repository;

import com.springjpa.springjpademo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
