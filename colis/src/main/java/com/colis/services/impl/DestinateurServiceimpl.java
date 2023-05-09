package com.colis.services.impl;


import com.colis.model.Colis;
import com.colis.model.Destinateur;
import com.colis.repository.Destinateur_Repository;
import com.colis.services.DestinateurService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class DestinateurServiceimpl implements DestinateurService {
   @Autowired
    Destinateur_Repository destinateur_repository;

    @Override
    public Destinateur save(Destinateur destinateur) {


        return destinateur_repository.save(destinateur) ;
    }

    @Override
    public Optional<Destinateur> finById(Long id) {

        return destinateur_repository.findById(id);





    }

    @Override
    public List<Destinateur> findAll() {
        return destinateur_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Destinateur ID is null");
            return ;
        }
        destinateur_repository.deleteById(id);

    }
}
