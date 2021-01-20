package com.emi.neo4jproject.Relationships;

import com.emi.neo4jproject.model.Transport;
import com.emi.neo4jproject.model.Usager;
import lombok.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

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

    public Utilise(Long id, Integer poids) {
        this.id = id;
        this.poids = poids;
    }
}
