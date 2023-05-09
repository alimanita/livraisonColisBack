package com.colis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Adresse implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;
    private  String pays;
    private  String ville;
    private  String region;
    private  String rue;
    private  Long code_postal;
  @OneToMany(mappedBy = "adresse")
private List<Expediteur> expediteurs ;
    @OneToMany(mappedBy = "adresse")
    private List<Destinateur> destinateurs = new ArrayList<>();





}
