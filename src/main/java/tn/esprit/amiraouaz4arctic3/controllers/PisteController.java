package tn.esprit.amiraouaz4arctic3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.amiraouaz4arctic3.Services.IPisteService;
import tn.esprit.amiraouaz4arctic3.entites.Piste;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteController {
    @Autowired
    IPisteService iPisteService;
    @GetMapping("/retrieveAllPistes")
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) iPisteService.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return iPisteService.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return iPisteService.updatePiste(piste);
    }

    @DeleteMapping("/removePiste/{id}")
    public void removePiste(@PathVariable("id") Long numPiste) {

        iPisteService.removePiste(numPiste);
    }

    @GetMapping("/retrievePiste/{id}")
    public Piste retrievePiste(@PathVariable("id") Long numPiste)
    {
        return iPisteService.retrievePiste(numPiste);

    }
    @PatchMapping("assign-skier-to-piste")
    public Piste assignSkierToPiste(
            @RequestParam Long numSkier,
            @RequestParam Long numPiste
    ) {
        return  iPisteService.assignSkierToPiste(numSkier, numPiste);
    }

}
