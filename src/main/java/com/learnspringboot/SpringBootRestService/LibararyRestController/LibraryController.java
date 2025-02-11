package com.learnspringboot.SpringBootRestService.LibararyRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;
import com.learnspringboot.SpringBootRestService.LibraryRepo.LibraryRepository;
import com.learnspringboot.SpringBootRestService.LibraryResponse.AddResponse;


@RestController
public class LibraryController {

    @Autowired
    LibraryRepository librepo;

    @PostMapping("/AddBook")
    public AddResponse AddBook(@RequestBody BeanClassLibrary librarybean) {
        String id = librarybean.getIsbn()+ librarybean.getAisle();
        librarybean.setId(id);
        librepo.save(librarybean);
        AddResponse rep = new AddResponse();
        rep.setMsg("Book is added");
        rep.setId(id);
        return rep;
    }

}
