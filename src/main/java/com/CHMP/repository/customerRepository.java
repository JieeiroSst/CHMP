package com.CHMP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.customer;

public interface customerRepository  extends JpaRepository<customer,Integer> {
}
