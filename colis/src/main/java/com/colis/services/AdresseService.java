package com.colis.services;




import com.colis.model.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    Adresse save(Adresse adresse);
    Optional<Adresse> finById(Long id);
    List<Adresse> findAll();
    void  delete(Long id);



}
