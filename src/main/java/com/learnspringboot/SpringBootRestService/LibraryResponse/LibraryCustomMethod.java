package com.learnspringboot.SpringBootRestService.LibraryResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryCustomInterface;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryRepository;

public class LibraryCustomMethod implements LibraryCustomInterface {

    @Autowired
    LibraryRepository repo;
    @Override
    public List<BeanClassLibrary> findAllByAuthor(String authorname) {
       List<BeanClassLibrary> bookswithAuthor = new ArrayList<>();
        List<BeanClassLibrary> books = repo.findAll();
        for(BeanClassLibrary item:books){
        if(item.getAuthor().equalsIgnoreCase(authorname)){
            bookswithAuthor.add(item);
        }
    }
        return bookswithAuthor;
    }

}
