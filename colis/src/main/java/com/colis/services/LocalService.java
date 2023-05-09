package com.colis.services;



import com.colis.model.Local;

import java.util.List;
import java.util.Optional;

public interface LocalService {
    Local save(Local local);
    Optional<Local> finById(Long id);
    List<Local> findAll();
    void  delete(Long id);
}
