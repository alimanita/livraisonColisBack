package com.colis.repository;


import com.colis.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Roles_Ripository extends JpaRepository<AppRole,Long> {
    AppRole findByNom (String rolename);
}
