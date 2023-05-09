package com.colis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Voyage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  Long id;
    private String date;
    @OneToMany
    private List<Colis> colis = new ArrayList<>();
    @ManyToOne
     private Livreur livreur;
    @ManyToOne
    private  Moyen_transport moyen_transport;
    @ManyToOne
    private  Utilisateur utilisateur;
}
