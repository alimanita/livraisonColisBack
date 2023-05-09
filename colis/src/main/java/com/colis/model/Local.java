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
public class Local  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String nom;
    @OneToMany
    private List<Utilisateur> utilisateurs = new ArrayList<>();
    @OneToMany
     private List<Colis> colis = new ArrayList<>();
}
