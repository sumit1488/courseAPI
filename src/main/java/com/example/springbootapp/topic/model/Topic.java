package com.example.springbootapp.topic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    private String name;
    @Id
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Topic(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Topic() {

    }
}
