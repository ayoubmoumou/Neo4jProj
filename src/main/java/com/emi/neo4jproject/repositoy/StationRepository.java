package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Station;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends Neo4jRepository<Station, Long> {
}
