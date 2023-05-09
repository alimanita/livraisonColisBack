package com.colis.api.controler;

import com.colis.api.ApiAppRole;

import com.colis.model.AppRole;
import com.colis.services.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:4200")
public class AppRoleControler implements ApiAppRole {
    @Autowired
    AppRoleService appRoleService;

    @Override
    public AppRole save(AppRole appRole) {
        return appRoleService.save(appRole);
    }

    @Override
    public Optional<AppRole> finById(Long id) {
        return appRoleService.finById(id);
    }

    @Override
    public List<AppRole> findAll() {
        return appRoleService.findAll();
    }

    @Override
    public void delete(Long id) {
appRoleService.delete(id);
    }
}
