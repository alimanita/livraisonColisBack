package com.colis.services;



import com.colis.model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    Utilisateur save(Utilisateur utilisateur);
    Optional<Utilisateur> finById(Long id);
    List<Utilisateur> findAll();
    void  delete(Long id);
}
