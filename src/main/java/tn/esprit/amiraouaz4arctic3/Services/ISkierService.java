package tn.esprit.amiraouaz4arctic3.Services;

import tn.esprit.amiraouaz4arctic3.entites.Skier;
import tn.esprit.amiraouaz4arctic3.entites.Subscription;
import tn.esprit.amiraouaz4arctic3.entites.typesubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ISkierService {
    public List<Skier> retrieveAllSkiers();
    public Skier addSkier(Skier skier);
    public Skier updateSkier(Skier skier);
    public void removeSkier(Long numSkier);
    public Skier retrieveSkier(Long numSkier);

    Skier assignSkierToPiste(Long numSkier, Long numPiste);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);

    // Retrieve skiers by subscription type


    // Retrieve subscriptions by type, sorted by start date


    // Retrieve skiers by subscription type
  //  List<Skier> retrieveSkiersBySubscriptionType(typesubscription typesubscription);

    // Retrieve subscriptions by type, sorted by start date
   // Set<Subscription> getSubscriptionByType(typesubscription type);

    // Retrieve subscriptions within a date range
    //List<Subscription> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
