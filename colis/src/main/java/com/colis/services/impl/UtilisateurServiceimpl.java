package com.colis.services.impl;




import com.colis.model.Utilisateur;
import com.colis.repository.Utilisateur_Repository;
import com.colis.services.UtilisateurService;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class UtilisateurServiceimpl implements UtilisateurService {
    @Autowired
    Utilisateur_Repository utilisateur_repository;
    @Override
    public Utilisateur save(Utilisateur utilisateur) {



            return utilisateur_repository.save(utilisateur) ;
    }

    @Override
    public Optional<Utilisateur> finById(Long id) {




        return utilisateur_repository.findById(id);
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateur_repository.findAll();
    }

    @Override
    public void delete(Long id) {

        utilisateur_repository.deleteById(id);

    }
}
