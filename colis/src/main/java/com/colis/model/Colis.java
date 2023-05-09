package com.colis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Colis implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private Long poids;
    private  Long prix;
    private String dateEnlevement;
    private  String statut;
    @ManyToOne
    @JoinColumn(name = "destinateur_id")
    private  Destinateur destinateur;
    @ManyToOne
    @JoinColumn(name = "expediteur_id")
    private  Expediteur expediteur;


    @ManyToOne
    @JoinColumn(name = "voyage_id")
    private  Voyage voyage;
    @ManyToOne
    @JoinColumn(name = "local_id")
    private  Local local;

    public Colis(Long id, Long poids, Long prix, String dateEnlevement, String statut, Destinateur destinateur, Expediteur expediteur) {
        this.id = id;
        this.poids = poids;
        this.prix = prix;
        this.dateEnlevement = dateEnlevement;
        this.statut = statut;
        this.expediteur=expediteur;
        this.destinateur=destinateur;
    }

    /*public Colis(Long id, Long poids, Long prix, String dateEnlevement, String statut, Destinateur destinateur, Expediteur expediteur) {
    }*/

}
