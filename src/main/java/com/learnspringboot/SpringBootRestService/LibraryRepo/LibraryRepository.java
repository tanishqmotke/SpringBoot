package com.learnspringboot.SpringBootRestService.LibraryRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;

public interface LibraryRepository extends JpaRepository<BeanClassLibrary,String>{

}
