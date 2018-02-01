package com.example.springbootapp.topic.resources;

import com.example.springbootapp.topic.model.Topic;
import com.example.springbootapp.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicResource {

    @Autowired
    TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {

        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") final int id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic body) {
        topicService.addTopic(body);
    }

    @PutMapping("topics/{id}")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @DeleteMapping("topics/{id}")
    public void deleteTopic(@PathVariable("id") final int id) {
        topicService.deleteTopic(id);
    }
}
