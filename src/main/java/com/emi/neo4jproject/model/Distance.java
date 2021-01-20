package com.emi.neo4jproject.model;


import com.emi.neo4jproject.model.Station;
import lombok.*;
import org.neo4j.ogm.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@RelationshipEntity(type = "DISTANCE")
public class Distance {

    @Id
    @GeneratedValue
    Long id;

    private Integer distance;

    @StartNode
    private Station stationDepart;

    @EndNode
    private Station stationArrive;

}
