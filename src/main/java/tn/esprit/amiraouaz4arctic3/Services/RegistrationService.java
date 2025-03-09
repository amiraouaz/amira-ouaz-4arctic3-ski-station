package tn.esprit.amiraouaz4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.Services.IRegistrationService;
import tn.esprit.amiraouaz4arctic3.entites.Course;
import tn.esprit.amiraouaz4arctic3.entites.Registration;
import tn.esprit.amiraouaz4arctic3.entites.Skier;
import tn.esprit.amiraouaz4arctic3.repositories.ICourseRepository;
import tn.esprit.amiraouaz4arctic3.repositories.IRegistrationRepository;
import tn.esprit.amiraouaz4arctic3.repositories.ISikierRepository;

@Service
public class RegistrationService implements IRegistrationService {

    @Autowired
    private IRegistrationRepository iregistrationRepository;

    @Autowired
    private ISikierRepository iskierRepository;
    @Autowired
    ICourseRepository courseRepository;
    @Autowired
    IRegistrationRepository iRegistrationRepository;



    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur) {
        // Retrieve the skier by ID
        Skier skier = iskierRepository.findById(numSkieur)
                .orElseThrow(() -> new RuntimeException("Skier not found with ID: " + numSkieur));

        // Link the skier to the registration
        registration.setSkier(skier);  // Set the skier on the registration

        // Save the registration
        return iregistrationRepository.save(registration);
    }
    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        // Retrieve the registration by ID
        Registration registration = iRegistrationRepository.findById(numRegistration)
                .orElseThrow(() -> new RuntimeException("Registration not found with ID: " + numRegistration));

        // Retrieve the course by ID
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found with ID: " + numCourse));

        // Assign the course to the registration
        registration.setCourse(course);

        // Save the updated registration
        return iRegistrationRepository.save(registration);
    }
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        // Save the Skier first
        Skier savedSkier = iskierRepository.save(skier);

        // Retrieve the course by its ID
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found with ID: " + numCourse));

        // Assign the course to the skier
        savedSkier.setCourse(course);

        // Save the updated skier with the assigned course
        return iskierRepository.save(savedSkier);
    }
}
