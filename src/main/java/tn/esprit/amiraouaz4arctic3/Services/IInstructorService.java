package tn.esprit.amiraouaz4arctic3.Services;

import tn.esprit.amiraouaz4arctic3.entites.Instructor;

import java.util.List;

public interface IInstructorService {
    List<Instructor> retrieveAllInstructors();

    Instructor addInstructor(Instructor instructor);

    Instructor updateInstructor(Instructor instructor);

    void removeInstructor(Long numInstructor);

    Instructor retrieveInstructor(Long numInstructor);

    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
}
