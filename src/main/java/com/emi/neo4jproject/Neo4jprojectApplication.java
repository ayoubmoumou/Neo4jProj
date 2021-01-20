package com.emi.neo4jproject;

import com.emi.neo4jproject.Relationships.Distance;
import com.emi.neo4jproject.model.Station;
import com.emi.neo4jproject.model.Usager;
//import com.emi.neo4jproject.repositoy.UsagerRepository;
import com.emi.neo4jproject.model.Ville;
import com.emi.neo4jproject.repositoy.*;
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

	private final static Logger log = LoggerFactory.getLogger(Neo4jprojectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Neo4jprojectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsagerRepository usagerRepository, VilleRepository villeRepository, StationRepository stationRepository, DistanceRepository distance, UtiliseRepository utiliseRepository, DistanceRepository distanceRepository) {
		return args -> {


			usagerRepository.deleteAll();
			villeRepository.deleteAll();
			stationRepository.deleteAll();
			distanceRepository.deleteAll();

			Usager greg = new Usager("Greg", true);
			Usager roy = new Usager("Roy", false);
			Usager craig = new Usager("Craig", false);

			Station station = new Station("babrouah", 2);
			Station station1 = new Station("agdal", 5);
			Station station2 = new Station("alabtal", 7);
			Station station4 = new Station("bab challa", 7);
			Station station3 = new Station("hemria", 9);

			distanceRepository.save(new Distance(2, station, station1));
			distanceRepository.save(new Distance(5, station1, station2));
			distanceRepository.save(new Distance(7, station, station2));
			distanceRepository.save(new Distance(12, station2, station4));

			Ville ville = new Ville("Rabat");
			Ville ville1 = new Ville("Meknes");

			station.setVille(ville);
			station1.setVille(ville);
			station2.setVille(ville);
			station3.setVille(ville1);




			List<Usager> team = Arrays.asList(greg, roy, craig);
			List<Ville> villes = Arrays.asList(ville, ville1);
			List<Station> stations = Arrays.asList(station, station1, station2, station3);

//			stationRepository.saveAll(stations);
//			villeRepository.saveAll(villes);

			log.info("Before linking up with Neo4j...");

			team.stream().forEach(usager -> log.info("\t" + usager.toString()));



			usagerRepository.save(greg);
			usagerRepository.save(roy);
			usagerRepository.save(craig);


		};
	}
}
