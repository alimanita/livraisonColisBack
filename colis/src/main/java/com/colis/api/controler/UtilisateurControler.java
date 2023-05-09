package com.colis.api.controler;

import com.colis.api.ApiUtilisateur;

import com.colis.model.Utilisateur;

import com.colis.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurControler implements ApiUtilisateur {
    @Autowired
    UtilisateurService utilisateurService;
    //@Autowired
   // AccountService accountService;

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @Override
    public Optional<Utilisateur> finById(Long id) {
        return utilisateurService.finById(id);
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }

    @Override
    public void delete(Long id) {
        utilisateurService.delete(id);

    }

}
