package com.CHMP.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.admin;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface adminRepository extends JpaRepository<admin, Integer> {

    @Query("select * from admin a where a.name=:name and a.password=:password ")
    public boolean login(@Param("name")String name,@Param("password")String password);
}
