package com.colis.api.controler;

import com.colis.api.ApiLocal;

import com.colis.model.Local;
import com.colis.services.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/local")
@CrossOrigin(origins = "http://localhost:4200")
public class LocalControler implements ApiLocal {
    @Autowired
    LocalService localService;

    @Override
    public Local save(Local local) {
        return localService.save(local);
    }

    @Override
    public Optional<Local> finById(Long id) {
        return localService.finById(id);
    }

    @Override
    public List<Local> findAll() {
        return localService.findAll();
    }

    @Override
    public void delete(Long id) {
localService.delete(id);
    }
}
