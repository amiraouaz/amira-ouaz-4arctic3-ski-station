package tn.esprit.amiraouaz4arctic3.Services;

import tn.esprit.amiraouaz4arctic3.entites.Course;

import java.util.List;

public interface ICourseService {

    List<Course> retrieveAllCourses();

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void removeCourse(Long numCourse);

    Course retrieveCourse(Long numCourse);
}
