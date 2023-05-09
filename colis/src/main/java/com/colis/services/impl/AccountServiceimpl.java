/*
package com.colis.services.impl;

import com.colis.model.AppRole;
import com.colis.model.Utilisateur;
import com.colis.repository.Roles_Ripository;
import com.colis.repository.Utilisateur_Repository;
import com.colis.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceimpl implements AccountService {
    @Autowired

    Utilisateur_Repository appuserRipository;
    @Autowired
    Roles_Ripository approleRipository;

    PasswordEncoder passwordEncoder;

    public AccountServiceimpl(Utilisateur_Repository appuserRipository, Roles_Ripository approleRipository, PasswordEncoder passwordEncoder) {
        this.appuserRipository = appuserRipository;
        this.approleRipository = approleRipository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Utilisateur addUser(Utilisateur appUser) {
String pw = appUser.getMot_de_passe();
appUser.setMot_de_passe(passwordEncoder.encode(pw));
        return appuserRipository.save(appUser);
    }

    @Override
    public AppRole addRole(AppRole appRole) {

        return approleRipository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        Utilisateur appUser = appuserRipository.findByNom(username);
        AppRole appRole = approleRipository.findByNom(rolename);
        appUser.getAppRoles().add(appRole);
    }

    @Override
    public Utilisateur loadByUsername(String username) {
        return  appuserRipository.findByNom(username);
    }


    @Override
    public List<Utilisateur> listeUser() {
        return null;
    }
}*/
