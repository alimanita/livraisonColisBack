package com.colis.services;



import com.colis.model.AppRole;

import java.util.List;
import java.util.Optional;

public interface AppRoleService {
    AppRole save(AppRole dto);
    Optional<AppRole> finById(Long id);
    List<AppRole> findAll();
    void  delete(Long id);
    void delet(AppRole appRole);
}
