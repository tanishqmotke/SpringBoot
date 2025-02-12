CREATE DATABASE APIDevelopSpringBoot;

use APIDevelopSpringBoot;

CREATE TABLE LibraryDemo (
    book_name varchar(50),
    id varchar(50) PRIMARY KEY,
    isbn varchar(50),
    aisle int,
    author varchar(50)
);

INSERT INTO LibraryDemo(book_name,id,isbn,aisle,author) values("Appium","fdsefr343","fdsefr3","43","Rahul Shetty");
select * from Storage2 where id="fdsefr343";
ALTER TABLE LibraryDemo RENAME TO Storage2;
select * from Storage2;