package tn.esprit.amiraouaz4arctic3.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.entites.Skier;
import tn.esprit.amiraouaz4arctic3.repositories.ISikierRepository;

import java.util.List;
@Service
public class SkierService implements ISkierService {
    @Autowired
    ISikierRepository iSikierRepository;

    @Override
    public List<Skier> retrieveAllSkiers() {

        return (List<Skier>) iSikierRepository.findAll();    }

    @Override
    public Skier addSkier(Skier skier) {
        return iSikierRepository.save(skier) ;    }

    @Override
    public Skier updateSkier(Skier skier) {

        return iSikierRepository.save(skier) ;    }

    @Override
    public void removeSkier(Long numSkier) {
        iSikierRepository.deleteById(numSkier) ;

    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return iSikierRepository.findById(numSkier).orElse(null) ;    }
}
