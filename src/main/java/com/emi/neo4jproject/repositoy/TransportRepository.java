package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Transport;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends Neo4jRepository<Transport, Long> {
}
