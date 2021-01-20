package com.emi.neo4jproject.model;

import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@NodeEntity
public class Usager {

    @Id @GeneratedValue
    Long id;
    private String nom;
    private LocalDate anneeNaissance;
    private boolean handicap;
    private Fonction fonction;
    private TransportTypes pT;


    @Relationship(type = "UTILISE")
    private Set<Transport> transports;


}
