package com.CHMP.services;

import com.CHMP.DTO.orderLine;
import com.CHMP.repository.orderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;

@Service
public class orderLineService {
    @Autowired
    private orderLineRepository repo;

    public List<orderLine> listAll(){
        return repo.findAll();
    }

    public void save(orderLine orderLines){
        repo.save(orderLines);
    }

    public orderLine get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }
}
