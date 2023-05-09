package com.colis.api.controler;

import com.colis.api.ApiMoyen_transport;


import com.colis.model.Moyen_transport;
import com.colis.services.Moyen_transportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transport")
@CrossOrigin(origins = "http://localhost:4200")
public class Moyen_transportControler implements ApiMoyen_transport {
    @Autowired
    Moyen_transportService moyen_transportService;

    @Override
    public Moyen_transport save(Moyen_transport moyen_transport){
        return moyen_transportService.save(moyen_transport);
    }

    @Override
    public Optional<Moyen_transport> finById(Long id) {
        return moyen_transportService.finById(id);
    }

    @Override
    public List<Moyen_transport> findAll() {
        return moyen_transportService.findAll();
    }

    @Override
    public void delete(Long id) {
moyen_transportService.delete(id);
    }
}
