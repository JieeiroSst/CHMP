package com.CHMP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.orderLine;

public interface orderLineRepository extends JpaRepository<orderLine,Integer>{
}
