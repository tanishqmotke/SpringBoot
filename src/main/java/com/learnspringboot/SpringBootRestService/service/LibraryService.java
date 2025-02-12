package com.learnspringboot.SpringBootRestService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryRepository;


@Service
public class LibraryService {

    private final LibraryRepository librepository;

    @Autowired  // Constructor-based dependency injection
    public LibraryService(LibraryRepository librepository) {
        this.librepository = librepository;
    }
    //@Autowired
    //LibraryRepository librepository;

    public boolean CheckIdExist(String id)
    {
        Optional<BeanClassLibrary> optional =librepository.findById(id);
       
        if(optional.isPresent())
            return true;
        else
            return false;
        
    }
}
