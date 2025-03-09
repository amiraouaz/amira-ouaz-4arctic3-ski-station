package tn.esprit.amiraouaz4arctic3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.amiraouaz4arctic3.entites.Registration;
import tn.esprit.amiraouaz4arctic3.Services.IRegistrationService;
import tn.esprit.amiraouaz4arctic3.entites.Skier;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private IRegistrationService iregistrationService;

    @PostMapping("/add/{numSkieur}")
    public Registration addRegistration(@RequestBody Registration registration, @PathVariable Long numSkieur) {
        return iregistrationService.addRegistrationAndAssignToSkier(registration, numSkieur);
    }

    @PostMapping("add-registration/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(
            @RequestBody Registration registration,
            @PathVariable(name = "numSkier") Long numSkier
    ) {
        return iregistrationService.addRegistrationAndAssignToSkier(registration, numSkier);
    }
}
