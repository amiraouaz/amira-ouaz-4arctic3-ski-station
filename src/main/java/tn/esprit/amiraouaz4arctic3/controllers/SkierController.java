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
    private IRegistrationService iregistrationService;
    public SkierController(ISkierService iSkierService) {
        this.iSkierService = iSkierService;
    }

    @PostMapping("/addSkier")
    public Skier addSkier(@RequestBody Skier skier)
    {
        return  iSkierService.addSkier(skier);
    }
    @PutMapping("/updateSkier")
    public Skier updateSkier(@RequestBody Skier skier) {
        return iSkierService.updateSkier(skier);
    }

    @DeleteMapping("/removeSkier/{id}")
    public void removeSkier(@PathVariable("id") Long numSkier) {
        iSkierService.removeSkier(numSkier);
    }

    @GetMapping("/retrieveSkier/{id}")
    public Skier cretrieveSkier(@PathVariable("id") Long numSkier) {
        return iSkierService.retrieveSkier(numSkier);
    }

    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable Long numCourse) {
        return iregistrationService.addSkierAndAssignToCourse(skier, numCourse);
    }


}
