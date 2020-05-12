package com.CHMP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;
import com.CHMP.DTO.product;
import com.CHMP.repository.productRepository;

@Service
public class productService {
    @Autowired
    private productRepository repo;

    public List<product> listAll(){
        return repo.findAll();
    }

    public void save(product products){
        repo.save(products);
    }

    public product get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }
}
