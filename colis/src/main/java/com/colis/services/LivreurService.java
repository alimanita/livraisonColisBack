package com.colis.services;



import com.colis.model.Livreur;

import java.util.List;
import java.util.Optional;

public interface LivreurService {
    Livreur save(Livreur dto);

    Optional<Livreur> finById(Long id);
    Long redId(Livreur livreur);
    List<Livreur> findAll();

    void  delete(Long id);

    List<Livreur> findByNom(String name);
    List<Livreur> findByNumtel(Long numtel);

}
