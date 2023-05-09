package com.colis.services;



import com.colis.model.Voyage;

import java.util.List;
import java.util.Optional;

public interface VoyageService {
    Voyage save(Voyage voyage);
    Optional<Voyage> finById(Long id);
    List<Voyage> findAll();
    void  delete(Long id);

}
