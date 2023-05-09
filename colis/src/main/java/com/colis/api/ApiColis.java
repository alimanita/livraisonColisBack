package com.colis.api;

import com.colis.model.Colis;
import com.colis.model.Destinateur;
import com.colis.model.Local;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiColis {
    @PostMapping(value =  "/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Colis save(@RequestBody Colis colis);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Colis> finById(@PathVariable Long id);

    @GetMapping(value = "/list/{idExpediteur}",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Colis> findByExpediteur(@PathVariable Long idExpediteur);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
  List<Colis> findAll();

    /*    @PostMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Colis> search(@RequestBody Colis colis);*/
    @GetMapping(value = "/col/{statut}",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Colis> findByStatut( @RequestParam  String statut);
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);


}
