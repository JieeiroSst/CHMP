package com.CHMP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.comment;

public interface commentRepository extends JpaRepository<comment, Integer> {
}
