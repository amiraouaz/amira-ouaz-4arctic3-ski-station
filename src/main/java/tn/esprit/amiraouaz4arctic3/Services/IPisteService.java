package tn.esprit.amiraouaz4arctic3.Services;

import tn.esprit.amiraouaz4arctic3.entites.Piste;

import java.util.List;

public interface IPisteService {

    public List<Piste> retrieveAllPistes();

    public Piste addPiste(Piste piste);

    public Piste updatePiste(Piste piste);

    public void removePiste(Long numPiste);

    public Piste retrievePiste(Long numPiste);

    Piste assignSkierToPiste(Long numSkier, Long numPiste);
}
