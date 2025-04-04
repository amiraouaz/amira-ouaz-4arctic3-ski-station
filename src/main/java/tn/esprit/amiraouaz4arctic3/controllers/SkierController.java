package tn.esprit.amiraouaz4arctic3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.amiraouaz4arctic3.Services.IRegistrationService;
import tn.esprit.amiraouaz4arctic3.Services.ISkierService;
import tn.esprit.amiraouaz4arctic3.entites.Skier;

@RestController
@RequestMapping("/Skier")
public class SkierController {

    @Autowired
    private ISkierService iSkierService;

    @Autowired
    private IRegistrationService iRegistrationService;

    // Constructor
    public SkierController(ISkierService iSkierService) {
        this.iSkierService = iSkierService;
    }

    // Add a new skier
    @PostMapping("/addSkier")
    public Skier addSkier(@RequestBody Skier skier) {
        return iSkierService.addSkier(skier);
    }

    // Update an existing skier
    @PutMapping("/updateSkier")
    public Skier updateSkier(@RequestBody Skier skier) {
        return iSkierService.updateSkier(skier);
    }

    // Remove a skier by ID
    @DeleteMapping("/removeSkier/{id}")
    public void removeSkier(@PathVariable("id") Long numSkier) {
        iSkierService.removeSkier(numSkier);
    }

    // Retrieve a skier by ID
    @GetMapping("/retrieveSkier/{id}")
    public Skier retrieveSkier(@PathVariable("id") Long numSkier) {
        return iSkierService.retrieveSkier(numSkier);
    }

    // Add skier and assign to course
    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable Long numCourse) {
        return iRegistrationService.addSkierAndAssignToCourse(skier, numCourse);
    }
}
