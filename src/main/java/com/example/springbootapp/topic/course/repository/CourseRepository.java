package com.example.springbootapp.topic.course.repository;

import com.example.springbootapp.topic.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    Course findById(int id);

    List<Course> findByTopicId(int id);
}
