package com.colis.services.impl;

import com.colis.model.Local;
import com.colis.repository.Local_Repository;
import com.colis.services.LocalService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class LocalServiceimpl implements LocalService {
    @Autowired

    Local_Repository local_repository;
    @Override
    public Local save(Local local) {


        return local_repository.save(local) ;
    }

    @Override
    public Optional<Local> finById(Long id) {
        if (id==null){
            log.error("Local ID is null");
            return null;
        }



        return local_repository.findById(id) ;

    }

    @Override
    public List<Local> findAll() {
        return local_repository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Local ID is null");
            return ;
        }
        local_repository.deleteById(id);

    }
}
