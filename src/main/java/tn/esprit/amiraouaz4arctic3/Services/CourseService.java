package tn.esprit.amiraouaz4arctic3.Services;

import tn.esprit.amiraouaz4arctic3.entites.Course;
import tn.esprit.amiraouaz4arctic3.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    ICourseRepository courseRepository;

    @Override
    public List<Course> retrieveAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void removeCourse(Long numCourse) {
        courseRepository.deleteById(numCourse); // conversion Long -> Integer si nécessaire
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }
}
