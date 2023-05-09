package com.colis.services.impl;


import com.colis.model.Colis;
import com.colis.model.Destinateur;

import com.colis.model.Expediteur;
import com.colis.model.Livreur;
import com.colis.repository.Colis_Repository;
import com.colis.repository.Livreur_Repository;
import com.colis.services.ColisService;

import com.colis.services.DestinateurService;
import com.colis.services.ExpediteurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@Transactional
public class ColisServiceimpl implements ColisService {
    @Autowired
    Colis_Repository colis_repository;
@Autowired
    ExpediteurService expediteurService;
@Autowired
    Livreur_Repository livreur_repository;
    @Autowired
    DestinateurService destinateurService;

    public ColisServiceimpl(Colis_Repository colis_repository, DestinateurService destinateurService) {
        this.colis_repository = colis_repository;
        this.destinateurService = destinateurService;
    }

    @Override
    public Colis save(Colis colis) {
        // check de l'expéditeur
  /*     if (colis.getExpediteur().getId() != null) {
            Optional<Expediteur>  expediteur = expediteurService.finById(colis.getExpediteur().getId());
            if (expediteur.isPresent()) {
                colis.setExpediteur(expediteur.get());
            } else {
                //gestion des exception
                log.error("l'expediteur est null pour le colis avec id expediteur {}", colis.getExpediteur().getId());
                throw new NullPointerException();
            }
        }*/
        // check du destinataire

        if (colis.getDestinateur().getId() != null) {
            Optional<Destinateur> destinateur = destinateurService.finById(colis.getDestinateur().getId());

            colis.setDestinateur(destinateur.get());

        } else {
            Destinateur newDestinataire = destinateurService.save(colis.getDestinateur());
            colis.setDestinateur(newDestinataire);
        }

        return colis_repository.save(colis);
    }

    @Override
    public List<Colis> findAll() {
        return colis_repository.findAll();
    }


    public Optional<Colis> finById(Long id) {


        return colis_repository.findById(id);

    }

    public List<Colis> finListById(List<Long> ids) {


        return colis_repository.findByIdIn(ids);

    }




    public List<Colis> findByExpediteur(Long idExpediteur) {
        log.info("begin find colis by expediteur with idexpediteur {}", idExpediteur);
        return colis_repository.findByExpediteur_id(idExpediteur);
    }

    @Override
    public List<Colis> findByStatut(String statut) {
        return colis_repository.findByStatut(statut);
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            log.error("Role ID is null");
            return;
        }
        colis_repository.deleteById(id);

    }



    // @Override
/*    public List<Colis> search(Colis colis) {
        QColis qColis = QColis.colis;
        BooleanExpression qColis1 = qColis.statut.startsWithIgnoreCase(colis.getStatut()).and(qColis.poids.eq(colis.getPoids()));

        Iterable iterable = colis_repository.findAll(qColis1);
        return (List<Colis>) StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }*/
}