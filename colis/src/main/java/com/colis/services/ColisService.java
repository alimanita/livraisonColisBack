package com.colis.services;


import com.colis.model.Colis;

import java.util.List;
import java.util.Optional;

public interface ColisService {
    Colis save(Colis dto);

    List<Colis> findAll();

    Optional<Colis> finById(Long id);


    List<Colis> findByExpediteur(Long idExpediteur);
    List<Colis> findByStatut(String statut);
    void  delete(Long id);

    public List<Colis> finListById(List<Long> ids);


  //  List<Colis> search(Colis colis);
}
