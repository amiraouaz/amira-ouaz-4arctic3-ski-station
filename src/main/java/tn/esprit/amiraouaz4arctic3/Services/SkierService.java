package tn.esprit.amiraouaz4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.entites.*;
import tn.esprit.amiraouaz4arctic3.repositories.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class SkierService implements ISkierService {

    @Autowired
    ISikierRepository iSikierRepository;

    @Autowired
    IPisteRepository iPisteRepository;

    @Autowired
    ICourseRepository courseRepository;

    @Autowired
    IRegistrationRepository iRegistrationRepository;

    @Autowired
    ISubscriptionRepository isubscriptionRepository;

    @Override
    public List<Skier> retrieveAllSkiers() {
        return (List<Skier>) iSikierRepository.findAll();
    }

    @Override
    public Skier addSkier(Skier skier) {
        return iSikierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return iSikierRepository.save(skier);
    }

    @Override
    public void removeSkier(Long numSkier) {
        iSikierRepository.deleteById(numSkier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return iSikierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public Skier assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier = iSikierRepository.findById(numSkier)
                .orElseThrow(() -> new RuntimeException("Skier not found"));
        Piste piste = iPisteRepository.findById(numPiste)
                .orElseThrow(() -> new RuntimeException("Piste not found"));

        skier.getPistes().add(piste);
        return iSikierRepository.save(skier);
    }

    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Subscription subscription = skier.getSubscription();
        isubscriptionRepository.save(subscription);

        Registration registration = new Registration();
        registration.setSkier(skier);
        registration.setCourse(course);
        registration.setDateRegistration(LocalDate.now());
        iRegistrationRepository.save(registration);

        skier.getRegistrations().add(registration);
        return iSikierRepository.save(skier);
    }



    // Retrieve skiers by subscription type
   /* @Override
    public List<Skier> retrieveSkiersBySubscriptionType(typesubscription typesubscription) {
        return iSikierRepository.findBytypesubscription(typesubscription);
    }

    // Retrieve subscriptions by type, sorted by start date
    @Override
    public Set<Subscription> getSubscriptionByType(typesubscription type) {
        return isubscriptionRepository.findBytypesubscriptionOrderByStartDateAsc(type);
    }

    // Retrieve subscriptions within a date range
    @Override
    public List<Subscription> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return isubscriptionRepository.findByStartDateBetween(startDate, endDate);
    }*/
}
