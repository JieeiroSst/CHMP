package com.CHMP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.CHMP.DTO.comment;
import com.CHMP.repository.commentRepository;
import java.util.List;

@Service
public class commentService {
    @Autowired
    private commentRepository repo;

    public List<comment> listAll(){
        return repo.findAll();
    }

    public void save(comment comments){
        repo.save(comments);
    }

    public comment get(Integer id){
        return repo.findById(id).get();
    }

    public void deleteID(Integer id){
        repo.deleteById(id);
    }

}
