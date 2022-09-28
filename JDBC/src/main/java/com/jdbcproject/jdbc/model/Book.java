//package com.jdbcproject.jdbc.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class Book {
//
//    private String bookName;
//    private String bookAuthor;
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookName='" + bookName + '\'' +
//                ", bookAuthor='" + bookAuthor + '\'' +
//                '}';
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getBookAuthor() {
//        return bookAuthor;
//    }
//
//    public void setBookAuthor(String bookAuthor) {
//        this.bookAuthor = bookAuthor;
//    }
//
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    protected Book() {
//        String query = "SELECT * FROM tbs_rabbit_service";
//        this.jdbcTemplate.update(query);
//        System.out.println("done");
//    }
//}