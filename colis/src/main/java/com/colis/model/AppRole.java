package com.colis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AppRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;
    private String nom ;
  @ManyToOne
private Utilisateur utilisateurs ;

}
