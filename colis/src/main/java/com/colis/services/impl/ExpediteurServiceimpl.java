package com.colis.services.impl;


import com.colis.model.Expediteur;
import com.colis.repository.Adresse_Repository;
import com.colis.repository.Colis_Repository;
import com.colis.repository.Expediteurt_Repository;
import com.colis.services.AdresseService;
import com.colis.services.ExpediteurService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class ExpediteurServiceimpl implements ExpediteurService {
    @Autowired
    Expediteurt_Repository expediteurt_repository;



    @Override
    public Expediteur save(Expediteur expediteur) {

        return expediteurt_repository.save(expediteur);
    }

    @Override
    public Optional<Expediteur> finById(Long id) {
        if (id==null){
            log.error("Expediteur ID is null");
            return null;
        }



        return expediteurt_repository.findById(id);

    }

    @Override
    public List<Expediteur> findAll() {
        return expediteurt_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Expediteur ID is null");
            return ;
        }
        expediteurt_repository.deleteById(id);

    }




}
