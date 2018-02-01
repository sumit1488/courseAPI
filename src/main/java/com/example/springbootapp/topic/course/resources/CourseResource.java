package com.example.springbootapp.topic.course.resources;

import com.example.springbootapp.topic.course.model.Course;
import com.example.springbootapp.topic.course.service.CourseService;
import com.example.springbootapp.topic.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseResource {

    @Autowired
    CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable("id") final int id) {

        return courseService.getAllCourses(id);
    }

    @GetMapping("/topics/{id}/courses/{courseId}")
    public Course getCourse(@PathVariable("courseId") final int courseId) {
        return courseService.getCourse(courseId);
    }

    @PostMapping("/topics/{id}/courses")
    public void addCourse(@PathVariable("id")final int id ,@RequestBody Course body) {
        body.setTopic(new Topic("",id));
        courseService.addCourse(body);
    }

    @PutMapping("/topics/{id}/courses/{courseId}")
    public void updateCourse(@PathVariable("id") final int id, @RequestBody Course course) {
        course.setTopic(new Topic("",id));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{id}/courses/{courseId}")
    public void deleteCourse(@PathVariable("id") final int id, @RequestBody Course course) {
        courseService.deleteCourse(course);
    }
}
