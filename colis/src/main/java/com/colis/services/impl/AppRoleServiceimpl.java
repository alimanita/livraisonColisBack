package com.colis.services.impl;


import com.colis.model.AppRole;

import com.colis.repository.Roles_Ripository;
import com.colis.services.AppRoleService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class AppRoleServiceimpl implements AppRoleService {
    @Autowired
    Roles_Ripository roles_ripository;

    @Override
    public AppRole save(AppRole appRole) {


        return roles_ripository.save(appRole);
    }

    @Override
    public Optional<AppRole> finById(Long id) {
        if (id==null){
            log.error("Role ID is null");
            return null;
        }



        return roles_ripository.findById(id);

    }

    @Override
    public List<AppRole> findAll() {
        return roles_ripository.findAll();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            log.error("Role ID is null");
            return ;
        }
        roles_ripository.deleteById(id);

    }

    @Override
    public void delet(AppRole appRole) {
        roles_ripository.delete(appRole);
    }
}
