package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Ville;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends Neo4jRepository<Ville, Long> {
}
