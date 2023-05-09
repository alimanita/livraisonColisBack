package com.colis.services.impl;




import com.colis.model.Moyen_transport;

import com.colis.repository.Moyen_transport_Repository;

import com.colis.services.Moyen_transportService;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class Moyen_transportServiceimpl implements Moyen_transportService {
    @Autowired
    Moyen_transport_Repository moyen_transport_repository;
   @Override
    public Moyen_transport save(Moyen_transport moyen_transport) {


        return moyen_transport_repository.save(moyen_transport) ;
    }

    @Override
    public Optional<Moyen_transport> finById(Long id) {
        if (id==null){
            log.error("Moyen de transport ID is null");
            return null;
        }



        return  moyen_transport_repository.findById(id);

    }

    @Override
    public List<Moyen_transport> findAll() {
        return moyen_transport_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Moyen de transport ID is null");
            return ;
        }
        moyen_transport_repository.deleteById(id);

    }
}
