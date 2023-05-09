package com.colis.services;



import com.colis.model.Moyen_transport;

import java.util.List;
import java.util.Optional;

public interface Moyen_transportService {
    Moyen_transport save(Moyen_transport moyen_transport);
    Optional<Moyen_transport> finById(Long id);
    List<Moyen_transport> findAll();
    void  delete(Long id);
}
