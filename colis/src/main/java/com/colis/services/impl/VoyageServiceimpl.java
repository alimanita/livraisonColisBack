package com.colis.services.impl;




import com.colis.model.Colis;
import com.colis.model.Livreur;
import com.colis.model.Moyen_transport;
import com.colis.model.Voyage;

import com.colis.repository.Voyage_Repository;

import com.colis.services.ColisService;
import com.colis.services.LivreurService;
import com.colis.services.Moyen_transportService;
import com.colis.services.VoyageService;

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
public class VoyageServiceimpl implements VoyageService {
@Autowired
    Voyage_Repository voyage_repository;
@Autowired
    LivreurService livreurService;
@Autowired
    Moyen_transportService moyen_transportService;

@Autowired
    ColisService colisService;
    @Override
    public Voyage save(Voyage voyage) {
//manage Livreur
        Livreur livreur = livreurService.finById(voyage.getLivreur().getId()).get();
        List<Colis> colisList = colisService.finListById(voyage.getColis().stream().map(colis -> colis.getId()).collect(Collectors.toList()));
        Moyen_transport moyen_transport = moyen_transportService.finById(voyage.getMoyen_transport().getId()).get();
        voyage.setLivreur(livreur);
        voyage.setMoyen_transport(moyen_transport);
        voyage.setColis(colisList);
        return voyage_repository.save(voyage) ;
    }

    @Override
    public Optional<Voyage> finById(Long id) {
        if (id==null){
            log.error("Voyage ID is null");
            return null;
        }



        return voyage_repository.findById(id);

    }

    @Override
    public List<Voyage> findAll() {
        return voyage_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Voyage ID is null");
            return ;
        }
        voyage_repository.deleteById(id);

    }
}
