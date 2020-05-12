package com.CHMP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.product;

public interface productRepository extends JpaRepository<product,Integer> {
}
