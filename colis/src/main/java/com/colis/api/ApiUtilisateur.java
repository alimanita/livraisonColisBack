package com.colis.api;


import com.colis.model.Utilisateur;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiUtilisateur {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Utilisateur save(@RequestBody Utilisateur utilisateur);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Utilisateur> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Utilisateur> findAll();
    @DeleteMapping("delete/{id}")
    void  delete(@PathVariable Long id);
 /*   @GetMapping(value = "/{username}",produces = MediaType.APPLICATION_JSON_VALUE)
    Utilisateur loadByUsername(String username);
*/
}
