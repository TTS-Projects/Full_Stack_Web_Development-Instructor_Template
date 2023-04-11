package com.techtalentsouth.TechTalentBlog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



	

@Entity
public class BlogPost {
    //sets the Id as the Primary Key
    @Id
	
    //allows the Id to be generated by the underlying database
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
    private String title;
    private String author;
    private String blogEntry;
    
    
    public BlogPost(){
        //non-argument constructor needed for JPA
    }
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title; 
	this.author = author;
	this.blogEntry = blogEntry;
    }

 //More code below here

    public String getTitle() {
    	return title;
    }

    public void setTitle(String title) {
    	this.title = title;
    }

    public String getAuthor() {
    	return author;
    }

    public void setAuthor(String author) {
    	this.author = author;
    }

    public String getBlogEntry() {
    	return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
    	this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
    	return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
    }



}