package com.colis.api;


import com.colis.model.Moyen_transport;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiMoyen_transport {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Moyen_transport save(@RequestBody Moyen_transport moyen_transport);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Moyen_transport> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Moyen_transport> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);
}

