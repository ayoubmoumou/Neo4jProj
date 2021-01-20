package com.emi.neo4jproject.model;

import com.emi.neo4jproject.model.Transport;
import com.emi.neo4jproject.model.Usager;
import lombok.*;
import org.neo4j.ogm.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@RelationshipEntity(type = "UTILISE")
public class Utilise {

    @Id
    @GeneratedValue
    Long id;

    private Integer poids;

    @StartNode
    private Usager usager;

    @EndNode
    private Transport transport;
}
