package com.colis.api.controler;

import com.colis.api.ApiExpediteur;
import com.colis.model.Expediteur;
import com.colis.services.ExpediteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expediteur")
@CrossOrigin(origins = "http://localhost:4200")
public class ExpediteurControler implements ApiExpediteur {
    @Autowired
    ExpediteurService expediteurService;

    @Override
    public Expediteur save(Expediteur expediteur) {
        return expediteurService.save(expediteur);
    }

    @Override
    public Optional<Expediteur> finById(Long id) {
        return expediteurService.finById(id);
    }

    @Override
    public List<Expediteur> findAll() {
        return expediteurService.findAll();
    }

    @Override
    public void delete(Long id) {
        expediteurService.delete(id);

    }
}
