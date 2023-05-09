package com.colis.api.controler;

import com.colis.api.ApiVoyage;

import com.colis.model.Voyage;
import com.colis.services.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voyage")
@CrossOrigin(origins = "http://localhost:4200")
public class VoyageControler implements ApiVoyage {
    @Autowired
    VoyageService voyageService;

    @Override
    public Voyage save(Voyage voyage) {
        return voyageService.save(voyage);
    }

    @Override
    public Optional<Voyage> finById(Long id) {
        return voyageService.finById(id);
    }

    @Override
    public List<Voyage> findAll() {
        return voyageService.findAll();
    }

    @Override
    public void delete(Long id) {
        voyageService.delete(id);

    }
}
