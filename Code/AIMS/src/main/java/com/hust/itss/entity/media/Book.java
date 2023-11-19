package com.hust.itss.entity.media;

import java.math.BigInteger;
import java.util.Date;

public class Book extends Media {

    private String authors;
    private String hardCover;
    private String publisher;
    private Date publicationDate;
    private int pages;
    private String language;
    private  String bookCategory;

    public Book(BigInteger id, String category, int price, int value, String title, String description, int quantity, Date importDate, Boolean rushOrderSupport, String type, String authors, String hardCover, String publisher, Date publicationDate, int pages, String language, String bookCategory) {
        super(id, category, price, value, title, description, quantity, importDate, rushOrderSupport, type);
        this.authors = authors;
        this.hardCover = hardCover;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.language = language;
        this.bookCategory = bookCategory;
    }

    public Book() {
        super();
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getHardCover() {
        return hardCover;
    }

    public void setHardCover(String hardCover) {
        this.hardCover = hardCover;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
}
