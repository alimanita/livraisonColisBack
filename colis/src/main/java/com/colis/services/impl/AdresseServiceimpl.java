package com.colis.services.impl;


import com.colis.model.Adresse;
import com.colis.repository.Adresse_Repository;
import com.colis.services.AdresseService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class AdresseServiceimpl implements AdresseService {
    @Autowired
    Adresse_Repository adresse_repository;
    @Override
    public Adresse save(Adresse adresse) {



return adresse_repository.save(adresse);

    }


    @Override
    public Optional<Adresse> finById(Long id) {
        if (id==null){
            log.error("Adresse ID is null");
            return null;
        }


        return  adresse_repository.findById(id);

    }

    @Override
    public List<Adresse> findAll() {
        return adresse_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Adresse ID is null");
            return ;
        }
        adresse_repository.deleteById(id);

    }

}
