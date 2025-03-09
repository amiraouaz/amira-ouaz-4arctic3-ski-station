package tn.esprit.amiraouaz4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.entites.Course;
import tn.esprit.amiraouaz4arctic3.entites.Instructor;
import tn.esprit.amiraouaz4arctic3.repositories.ICourseRepository;
import tn.esprit.amiraouaz4arctic3.repositories.InstructorRepository;

import java.util.List;
@Service
public class InstructorService  implements  IInstructorService{
    @Autowired
    private InstructorRepository instructorRepository;
    ICourseRepository courseRepository;
    @Override
    public List<Instructor> retrieveAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void removeInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }
    @Override
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElseThrow(() -> new RuntimeException("Course not found"));

        instructor.getCourses().add(course);
        return instructorRepository.save(instructor);
    }

}
