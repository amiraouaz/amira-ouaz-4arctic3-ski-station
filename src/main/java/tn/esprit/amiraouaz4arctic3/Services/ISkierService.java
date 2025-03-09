package tn.esprit.amiraouaz4arctic3.Services;


import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.entites.Skier;

import java.util.List;

public interface ISkierService {
    public List<Skier> retrieveAllSkiers() ;
    public Skier addSkier(Skier skier) ;
    public Skier updateSkier(Skier skier) ;
    public void removeSkier(Long numSkier) ;
    public Skier retrieveSkier(Long numSkier) ;
    Skier assignSkierToPiste(Long numSkier, Long numPiste);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
}
