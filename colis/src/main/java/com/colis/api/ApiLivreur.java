package com.colis.api;


import com.colis.model.Livreur;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiLivreur {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Livreur save(@RequestBody Livreur livreur);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Livreur> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    @PostAuthorize("hasAuthority('ADMIN')")
    List<Livreur> findAll();

@GetMapping(value = "/liv/{name}", produces = MediaType.APPLICATION_JSON_VALUE)

 List<Livreur> findByName(@PathVariable String name);

    @GetMapping(value = "/numliv/{numtel}" , produces = MediaType.APPLICATION_JSON_VALUE)
    List<Livreur> findByNumtel(@PathVariable Long numtel);
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);

}
