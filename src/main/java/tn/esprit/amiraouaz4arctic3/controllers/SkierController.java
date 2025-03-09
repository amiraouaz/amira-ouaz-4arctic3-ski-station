package tn.esprit.amiraouaz4arctic3.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.amiraouaz4arctic3.Services.SkierService;
import tn.esprit.amiraouaz4arctic3.entites.Skier;
import org.springframework.web.bind.annotation.*;

@RequestMapping("Skier")
public class SkierController {
    private SkierService ISkierService;
    @PostMapping("/addSkier")
    public Skier addSkier(@RequestBody Skier skier)
    {
        return  ISkierService.addSkier(skier);
    }
    @PutMapping("/updateSkier")
    public Skier updateSkier(@RequestBody Skier skier) {
        return ISkierService.updateSkier(skier);
    }

    @DeleteMapping("/removeSkier/{id}")
    public void removeSkier(@PathVariable("id") Long numSkier) {
        ISkierService.removeSkier(numSkier);
    }

    @GetMapping("/retrieveSkier/{id}")
    public Skier cretrieveSkier(@PathVariable("id") Long numSkier) {
        return ISkierService.retrieveSkier(numSkier);
    }




}
