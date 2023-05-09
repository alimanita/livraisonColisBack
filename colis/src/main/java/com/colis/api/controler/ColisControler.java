package com.colis.api.controler;

import com.colis.api.ApiColis;

import com.colis.model.Colis;
import com.colis.model.Destinateur;
import com.colis.services.ColisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/colis")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class ColisControler implements ApiColis {
    @Autowired
    ColisService colisService;

    public ColisControler(ColisService colisService) {
        this.colisService = colisService;
    }

    @Override
    public Colis save(Colis colis) {
        log.info("------> begin save colis : ", colis);
        return colisService.save(colis);
    }

    @Override
    public Optional<Colis> finById(Long id) {
        return colisService.finById(id);
    }

    @Override
    public List<Colis> findByExpediteur(@PathVariable Long idExpediteur) {
        log.info("Received request to get list colis by expediteur : {}", idExpediteur);
        return colisService.findByExpediteur(idExpediteur);
    }

    @Override
    public List<Colis> findAll() {
        return colisService.findAll();
    }

    // @Override
    //public List<Colis> findColis() {
  /*      List<Colis> res = new ArrayList<>();
        colisService.findAll().forEach(colis -> {
            res.add(new Colis(colis.getId(), colis.getPoids(), colis.getPrix(), colis.getDateEnlevement(), colis.getStatut(),
                    colis.getDestinateur()));
        });

        return res;*/
      //  return colisService.findColis();
    //}

/*
    @Override
    public List<Colis> search(Colis colis) {
        return colisService.search(colis);
    }
*/


    @Override
    public List<Colis> findByStatut(String statut) {
         log.info("------> begin finByStatut colis : ", statut);
        return colisService.findByStatut(statut);
    }



    @Override
    public void delete(Long id) {
colisService.delete(id);
    }
}
