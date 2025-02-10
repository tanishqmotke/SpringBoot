package com.learnspringboot.SpringBootRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.learnspringboot.SpringBootRestService.library.LibraryRepository;

@SpringBootApplication //main annotation which helps to start the server from the java class file.
public class SpringBootRestServiceApplication { 
//implements CommandLineRunner

	//@Autowired
	//LibraryRepository libraryrepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
	}

	// @Override
	// public void run(String[]args){
		
	// 	//get a book from the record
	// 	BeanClassLibrary lib =  libraryrepo.findById("fdsefr343").get();
	// 		System.out.println(lib.getAuthor());
		
	// 	//create a new book record
	// 		lib.setId("001");
	// 		lib.setAisle(10);
	// 		lib.setAuthor("tanishq");
	// 		lib.setIsbn("book23");
	// 		lib.setBook_name("demo record");
		
	// 	libraryrepo.save(lib);
	// 	System.out.println("Author is " + lib.getAuthor() + "and Book is " + lib.getBook_name());


	// } 

}
