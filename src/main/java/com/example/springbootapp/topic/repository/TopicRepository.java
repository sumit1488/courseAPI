package com.example.springbootapp.topic.repository;

import com.example.springbootapp.topic.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
    Topic findById(int id);
}
