package com.CHMP.services;

import com.CHMP.DTO.customer;
import com.CHMP.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;

@Service
public class customerService {
    @Autowired
    private customerRepository repo;

    public List<customer> listAll(){
        return repo.findAll();
    }

    public void save(customer customers){
        repo.save(customers);
    }

    public customer get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }
}
