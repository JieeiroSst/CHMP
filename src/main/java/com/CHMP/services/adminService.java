package com.CHMP.services;

import com.CHMP.DTO.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.CHMP.DTO.admin;
import com.CHMP.repository.adminRepository;
import java.util.List;

@Service
public class adminService {
    @Autowired
    private adminRepository repo;

    public List<admin> listAll(){
        return repo.findAll();
    }

    public void save(admin admin){
        repo.save(admin);
    }

    public admin get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }

    public boolean login(String name,String password){
        return repo.login(name,password);
    }
}
