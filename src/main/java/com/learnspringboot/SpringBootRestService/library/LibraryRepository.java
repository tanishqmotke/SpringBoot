package com.learnspringboot.SpringBootRestService.library;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringboot.SpringBootRestService.controller.BeanClassLibrary;

public interface LibraryRepository extends JpaRepository<BeanClassLibrary,String>{

}
