package com.learnspringboot.SpringBootRestService.LibararyRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryRepository;
import com.learnspringboot.SpringBootRestService.LibraryResponse.AddResponse;
//import com.learnspringboot.SpringBootRestService.service.LibraryService;
import com.learnspringboot.SpringBootRestService.service.LibraryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class LibraryController {

    @Autowired
    LibraryRepository librepo;

    @PostMapping("/AddBook")
    public ResponseEntity AddBook(@RequestBody BeanClassLibrary librarybean) {
        LibraryService checkid = new LibraryService(librepo);
        String id = librarybean.getIsbn()+ librarybean.getAisle();
        librarybean.setId(id);
        librepo.save(librarybean);
        AddResponse rep = new AddResponse();
        HttpHeaders headers = new HttpHeaders();
    if(!checkid.CheckIdExist(id)){
        headers.add("unique", id);
        rep.setMsg("Book is added");
        rep.setId(id);
        return new ResponseEntity<AddResponse>(rep,headers,HttpStatus.CREATED);
    }else{
        rep.setMsg("Book already exist");
        rep.setId(id);
        return new ResponseEntity<AddResponse>(rep,headers,HttpStatus.ACCEPTED);
    }

    }

    @GetMapping("/GetBook/{id}")
    public BeanClassLibrary GetBook(@PathVariable(value="id")String id){
        try{
        BeanClassLibrary beanlib = librepo.findById(id).get();
        return beanlib;
    }catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
    @GetMapping("/GetBooks/author")
    public List<BeanClassLibrary> getBookByAuthor(@RequestParam(value="authorname")String authorname){
        return librepo.findAllByAuthor(authorname);
    }
    

}
