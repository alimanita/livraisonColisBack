package com.colis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Expediteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String nom;
    private  String prenom;
    private  Long num_tel;
    @ManyToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;
    @OneToMany
    private List<Colis> colis  ;




}
