package com.emi.neo4jproject.repositoy;

import com.emi.neo4jproject.model.Usager;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface UsagerRepository extends Neo4jRepository<Usager, Long> {

    Usager findByNom(@Param("nom") String nom);



}
