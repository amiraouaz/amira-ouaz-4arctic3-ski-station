package tn.esprit.amiraouaz4arctic3.Services;


import tn.esprit.amiraouaz4arctic3.entites.Registration;
import tn.esprit.amiraouaz4arctic3.entites.Skier;

public interface IRegistrationService {
        Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur);
        Registration assignRegistrationToCourse(Long numRegistration, Long numCourse);
        Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);

    }


