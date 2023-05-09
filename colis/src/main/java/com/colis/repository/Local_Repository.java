package com.colis.repository;

import com.colis.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Local_Repository extends JpaRepository<Local,Long> {
    List<Local> findAll();

}
