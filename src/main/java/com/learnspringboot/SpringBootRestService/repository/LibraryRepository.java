package com.learnspringboot.SpringBootRestService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringboot.SpringBootRestService.controller.Library;

public interface LibraryRepository extends JpaRepository<Library,String> {

}
