package com.colis.services;



import com.colis.model.Destinateur;

import java.util.List;
import java.util.Optional;

public interface DestinateurService {
    Destinateur save(Destinateur destinateur);
    Optional<Destinateur> finById(Long id);
    List<Destinateur> findAll();
    void  delete(Long id);
}
