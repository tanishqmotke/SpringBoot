package com.learnspringboot.SpringBootRestService.LibararyRestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryRepository;


@RestController
public class LibraryController {

    @Autowired
    LibraryRepository librepo;

    @PostMapping("/AddBook")
    public void AddBook(@RequestBody BeanClassLibrary librarybean) {
        librarybean.setId(librarybean.getIsbn()+ librarybean.getAisle());
        librepo.save(librarybean);

    }

}
