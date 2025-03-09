package tn.esprit.amiraouaz4arctic3.controllers;

import tn.esprit.amiraouaz4arctic3.Services.ICourseService;
import tn.esprit.amiraouaz4arctic3.entites.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    ICourseService courseService;

    @GetMapping("/retrieveAllCourses")
    public List<Course> retrieveAllCourses() {
        return courseService.retrieveAllCourses();
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/removeCourse/{id}")
    public void removeCourse(@PathVariable("id") Long numCourse) {
        courseService.removeCourse(numCourse);
    }

    @GetMapping("/retrieveCourse/{id}")
    public Course retrieveCourse(@PathVariable("id") Long numCourse) {
        return courseService.retrieveCourse(numCourse);
    }
}
