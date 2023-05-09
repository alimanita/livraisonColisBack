package com.colis.api.controler;

import com.colis.api.ApiLivreur;

import com.colis.model.Livreur;
import com.colis.services.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livreur")
@CrossOrigin(origins = "http://localhost:4200")
public class LivreurControler implements ApiLivreur {
    @Autowired
    LivreurService livreurService;

    @Override
    public Livreur save(Livreur livreur) {
        return livreurService.save(livreur);
    }

    @Override
    public Optional<Livreur> finById(Long id) {
        return livreurService.finById(id);
    }

    @Override
    public List<Livreur> findAll() {
        return livreurService.findAll();
    }

  @Override
    public List<Livreur> findByName(String name) {
        return livreurService.findByNom(name);
    }

    @Override
    public List<Livreur> findByNumtel(Long numtel) {
        return livreurService.findByNumtel(numtel);
    }


    @Override
    public void delete(Long id) {
        livreurService.delete(id);

    }

}