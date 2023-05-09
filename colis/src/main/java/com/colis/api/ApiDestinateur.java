package com.colis.api;


import com.colis.model.Destinateur;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiDestinateur {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Destinateur save(@RequestBody Destinateur destinateur);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Destinateur> finById(@PathVariable  Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Destinateur> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);
}
