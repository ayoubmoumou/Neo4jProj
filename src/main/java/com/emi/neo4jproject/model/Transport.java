package com.emi.neo4jproject.model;


import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@NodeEntity
public class Transport {
    @Id
    @GeneratedValue
    Long id;

    private TransportTypes typeTransport;
    private Integer numero;
    private String matricule;
    //    private String ville;
    private Integer vitesse;
    private Integer capacite;
    private String PdC;
    private Integer prix;
    private String marque;

    @Relationship(type = "TRAVERSE")
    private Set<Station> stations;

    @Relationship(type="UTILISE", direction = Relationship.INCOMING)
    private Set<Utilise> utilisateurs;
}
