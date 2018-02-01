package com.example.springbootapp.topic.course.service;

import com.example.springbootapp.topic.course.model.Course;
import com.example.springbootapp.topic.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(int id) {
        return courseRepository.findByTopicId(id);
    }

    public Course getCourse(int id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course body) {
        courseRepository.save(body);
    }


    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse( Course course) {
        courseRepository.delete(course);
    }
}
