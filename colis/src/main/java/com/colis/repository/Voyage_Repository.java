package com.colis.repository;

import com.colis.model.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Voyage_Repository extends JpaRepository<Voyage,Long> {

}
