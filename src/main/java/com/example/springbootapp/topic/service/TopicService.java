package com.example.springbootapp.topic.service;

import com.example.springbootapp.topic.repository.TopicRepository;
import com.example.springbootapp.topic.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    /*List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("Spring Boot", 001),
            new Topic("Java", 002), new Topic("C++", 003)));*/

    public List<Topic> getAllTopics() {
        //return topicList;
        return topicRepository.findAll();
    }

    public Topic getTopic(int id) {
        //return topicList.stream().filter(topic->topic.getId().equals(id)).findFirst().get();
       return topicRepository.findById(id);
    }

    public void addTopic(Topic body) {
        //topicList.add(body);
        topicRepository.save(body);
    }


    public void updateTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.delete(id);
    }
}
