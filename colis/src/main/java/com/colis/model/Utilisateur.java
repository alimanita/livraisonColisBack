package com.colis.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Utilisateur implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Long num_tel;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  String mot_de_passe;
 @OneToMany
  private List<AppRole> appRoles =new ArrayList<>();
   @OneToMany
    private List<Voyage> voyages ;
    @ManyToOne
    @JoinColumn(name = "id_locale")
    private  Local local;
}
