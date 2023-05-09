package com.colis.api;


import com.colis.model.AppRole;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiAppRole {
    @PostMapping(value =  "/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    AppRole save(@RequestBody AppRole appRole);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<AppRole> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<AppRole> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);

}

