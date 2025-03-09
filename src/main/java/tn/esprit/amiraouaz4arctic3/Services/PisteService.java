package tn.esprit.amiraouaz4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.amiraouaz4arctic3.entites.Piste;
import tn.esprit.amiraouaz4arctic3.repositories.IPisteRepository;

import java.util.List;
@Service
public class PisteService implements IPisteService {
    @Autowired
     IPisteRepository iPisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return  (List<Piste>) iPisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {

        return iPisteRepository.save(piste) ;
    }

    @Override
    public Piste updatePiste(Piste piste) {

        return iPisteRepository.save(piste) ;    }

    @Override
    public void removePiste(Long numPiste) {
        iPisteRepository.deleteById(numPiste);

    }

    @Override
    public Piste retrievePiste(Long numPiste)
    {
        return iPisteRepository.findById(numPiste).orElse(null) ;
    }

    @Override
    public Piste assignSkierToPiste(Long numSkier, Long numPiste) {
        return null;
    }


}
