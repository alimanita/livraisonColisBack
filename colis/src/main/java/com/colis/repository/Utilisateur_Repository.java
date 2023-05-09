package com.colis.repository;


import com.colis.model.AppRole;
import com.colis.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Utilisateur_Repository extends JpaRepository<Utilisateur,Long> {
    Utilisateur findByNom (String rolename);
}
