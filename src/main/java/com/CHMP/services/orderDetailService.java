package com.CHMP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;
import com.CHMP.DTO.orderDetail;
import com.CHMP.repository.orderDetailRepository;

@Service
public class orderDetailService {
    @Autowired
    private orderDetailRepository repo;

    public List<orderDetail> listAll(){
        return repo.findAll();
    }

    public void save(orderDetail orders){
        repo.save(orders);
    }

    public orderDetail get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }
}
