package com.learnspringboot.SpringBootRestService.LibraryRepo;

import java.util.List;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;

public interface LibraryCustomInterface {

    List<BeanClassLibrary> findAllByAuthor(String authorname);
    //List<BeanClassLibrary> findAllBook();
    
}
