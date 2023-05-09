package com.colis.api.controler;

import com.colis.api.APIAdress;

import com.colis.model.Adresse;
import com.colis.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adresse")
@CrossOrigin(origins = "http://localhost:4200")
public class AdresseControler implements APIAdress {
    @Autowired
    AdresseService adresseService;

    @Override
    public Adresse save(Adresse adresse) {
        return adresseService.save(adresse);
    }

    @Override
    public Optional<Adresse> finById(Long id) {
        return adresseService.finById(id);
    }

    @Override
    public List<Adresse> findAll() {
        return adresseService.findAll();
    }

    @Override
    public void delete(Long id) {
adresseService.delete(id);
    }
}
