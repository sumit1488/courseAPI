package com.example.springbootapp.topic.course.model;

import com.example.springbootapp.topic.model.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    private String name;
    @Id
    private Integer id;
    private String description;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @ManyToOne
    private Topic topic;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public Course(String name, Integer id, String desc, int topicId) {
        this.name = name;
        this.id = id;
        this.description = desc;
        this.topic = new Topic("", topicId);
    }

    public Course() {

    }
}
