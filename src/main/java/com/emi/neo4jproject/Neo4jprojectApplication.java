package com.emi.neo4jproject;

import com.emi.neo4jproject.model.Usager;
//import com.emi.neo4jproject.repositoy.UsagerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4jprojectApplication {
//	private UsagerRepository usagerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Neo4jprojectApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//
////			usagerRepository.deleteAll();
////
////			Usager greg = new Usager(1L,"Greg");
////			Usager roy = new Usager(2L,"Roy");
////			Usager craig = new Usager(3L,"Craig");
////
////			List<Usager> team = Arrays.asList(greg, roy, craig);
////
////			log.info("Before linking up with Neo4j...");
////
////			team.stream().forEach(usager -> log.info("\t" + usager.toString()));
////
////			usagerRepository.save(greg);
////			usagerRepository.save(roy);
////			usagerRepository.save(craig);
//
//
//		};
//	}
}
