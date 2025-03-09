package tn.esprit.amiraouaz4arctic3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.amiraouaz4arctic3.Services.IInstructorService;
import tn.esprit.amiraouaz4arctic3.entites.Instructor;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private IInstructorService instructorService;

    @GetMapping("/retrieveAllInstructors")
    public List<Instructor> retrieveAllInstructors() {
        return instructorService.retrieveAllInstructors();
    }

    @PostMapping("/addInstructor")
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/updateInstructor")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/removeInstructor/{id}")
    public void removeInstructor(@PathVariable("id") Long numInstructor) {
        instructorService.removeInstructor(numInstructor);
    }

    @GetMapping("/retrieveInstructor/{id}")
    public Instructor retrieveInstructor(@PathVariable("id") Long numInstructor) {
        return instructorService.retrieveInstructor(numInstructor);
    }
}
