package com.colis.services.impl;


import com.colis.model.Livreur;
import com.colis.repository.Livreur_Repository;
import com.colis.services.LivreurService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
public class LivreurServiceimpl implements LivreurService {
    public LivreurServiceimpl(Livreur_Repository livreur_repository) {
        this.livreur_repository = livreur_repository;
    }

    @Autowired
    Livreur_Repository livreur_repository;

    @Override
    public Livreur save(Livreur livreur) {


        return livreur_repository.save(livreur);
    }


    @Override
    public Optional<Livreur> finById(Long id) {
        if (id == null) {
            log.error("Livreur ID is null");
            return null;
        }


        return livreur_repository.findById(id);

    }

    @Override
    public Long redId(Livreur livreur) {
        return null;
    }


    @Override
    public List<Livreur> findAll() {
        return livreur_repository.findAll();
    }


    @Override
    public void delete(Long id) {
        if (id == null) {
            log.error("Livreur ID is null");
            return;
        }
        livreur_repository.deleteById(id);

    }

    @Override
    public List<Livreur> findByNom(String name) {
        return livreur_repository.findByNom(name);
    }

    @Override
    public List<Livreur> findByNumtel(Long numtel) {
        return livreur_repository.findByNumtel(numtel);
    }


}
