package com.colis.repository;

import com.colis.model.Colis;
import com.colis.model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Livreur_Repository extends JpaRepository<Livreur,Long>,CrudRepository<Livreur,Long>{


    @Query("select l from Livreur l where l.nom = ?1")
    List<Livreur> findByNom(String name);

    @Query("select l from Livreur l where l.numtel = ?1")
    List<Livreur> findByNumtel(Long numtel);

}
