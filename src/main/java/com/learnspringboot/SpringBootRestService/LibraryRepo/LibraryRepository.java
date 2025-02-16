package com.learnspringboot.SpringBootRestService.LibraryRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnspringboot.SpringBootRestService.LibraryBean.BeanClassLibrary;

@Repository
public interface LibraryRepository extends LibraryCustomInterface,JpaRepository <BeanClassLibrary,String>{
 
}
