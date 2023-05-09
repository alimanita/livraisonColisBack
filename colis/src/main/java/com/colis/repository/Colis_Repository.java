package com.colis.repository;

import com.colis.model.Colis;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Colis_Repository extends JpaRepository<Colis, Long> {
    List<Colis> findByExpediteur_id(Long idExpediteur);
     List<Colis> findByStatut(String statut);
     List<Colis> findByIdIn(List<Long> ids);

}
