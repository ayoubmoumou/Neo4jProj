package com.emi.neo4jproject.model;

import com.emi.neo4jproject.model.Station;
import com.emi.neo4jproject.model.Transport;
import lombok.*;
import org.neo4j.ogm.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@RelationshipEntity(type = "TRAVERSE")
public class Traverse {

    @Id
    @GeneratedValue
    Long id;

    private Integer heureArrive;

    @StartNode
    private Transport transport;

    @EndNode
    private Station station;

}
