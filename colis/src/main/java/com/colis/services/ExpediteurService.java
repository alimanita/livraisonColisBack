package com.colis.services;


import com.colis.model.Expediteur;

import java.util.List;
import java.util.Optional;

public interface ExpediteurService {

    Expediteur save(Expediteur expediteur);
    Optional<Expediteur> finById(Long id);
    List<Expediteur> findAll();
    void  delete(Long id);
}
