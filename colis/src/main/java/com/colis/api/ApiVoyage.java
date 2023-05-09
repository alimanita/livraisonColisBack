package com.colis.api;


import com.colis.model.Voyage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiVoyage  {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Voyage save(@RequestBody Voyage voyage);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Voyage> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Voyage> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);
}

