package com.colis.api.controler;

import com.colis.api.ApiDestinateur;

import com.colis.model.Destinateur;
import com.colis.services.DestinateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/destinateur")
@CrossOrigin(origins = "http://localhost:4200")
public class DestinateurControler implements ApiDestinateur {
    @Autowired
    DestinateurService destinateurService;

    public DestinateurControler(DestinateurService destinateurService) {
        this.destinateurService = destinateurService;
    }

    @Override
    public Destinateur save(Destinateur destinateur) {
        return destinateurService.save(destinateur);
    }

    @Override
    public Optional<Destinateur> finById(Long id) {
        return destinateurService.finById(id);
    }

    @Override
    public List<Destinateur> findAll() {
        return destinateurService.findAll();
    }

    @Override
    public void delete(Long id) {
        destinateurService.delete(id);

    }
}
