package com.emi.neo4jproject.model;

import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@NodeEntity
public class Station {

    @Id @GeneratedValue
    Long id;

    private String nom;
    private Integer numero;

    @Relationship(type="DISTANCE")
    private Set<Station> stations;

    @Relationship(type = "SITUE")
    private Ville ville;




}
