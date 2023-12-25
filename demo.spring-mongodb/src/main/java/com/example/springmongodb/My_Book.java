package com.example.springmongodb;

import org.springframework.data.mongodb.core.mapping.Document;

//name should be same as collection name
@Document
public class My_Book {
    private String name;
    private String author;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public My_Book() {}
    public My_Book(String name, String author, int cost) {
        this.name= name;
        this.author= author;
        this.cost= cost;
    }

}
