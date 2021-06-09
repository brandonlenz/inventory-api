package com.brandonlenz.inventoryapi.application;

import com.brandonlenz.inventoryapi.application.model.Part;
import com.brandonlenz.inventoryapi.application.model.Region;
import com.brandonlenz.inventoryapi.application.model.RegionalQuantity;
import com.brandonlenz.inventoryapi.application.repository.PartRepository;
import com.brandonlenz.inventoryapi.application.repository.RegionRepository;
import com.brandonlenz.inventoryapi.application.repository.RegionalQuantityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApiApplication {

	private final Logger log = LoggerFactory.getLogger(InventoryApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InventoryApiApplication.class, args);
	}

//	@Bean
//	CommandLineRunner loadDemoData(
//			PartRepository partRepository,
//			RegionRepository regionRepository,
//			RegionalQuantityRepository regionalQuantityRepository) {
//		return (args) -> {
//			log.info("Adding demo Data:");
//
//			log.info("- Adding demo Parts:");
//			Part ssd = new Part("SSD", "1abc");
//			Part cpu = new Part("CPU", "2abc");
//			Part gpu = new Part("GPU", "3abc");
//			Part motherboard = new Part("Motherboard", "4abc");
//
//			log.info("  - ".concat(partRepository.save(ssd).toString()));
//			log.info("  - ".concat(partRepository.save(cpu).toString()));
//			log.info("  - ".concat(partRepository.save(gpu).toString()));
//			log.info("  - ".concat(partRepository.save(motherboard).toString()));
//			log.info("/ Finished adding demo Parts");
//
//			log.info("- Adding demo Regions:");
//			Region northAmerica = new Region("North America", "NA");
//			Region europe = new Region("Europe", "EU");
//			log.info("  - ".concat(regionRepository.save(northAmerica).toString()));
//			log.info("  - ".concat(regionRepository.save(europe).toString()));
//			log.info("/ Finished adding demo Regions");
//
//			log.info("- Setting some quantities:");
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(cpu, northAmerica, 10000L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(ssd, northAmerica, 5000L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(gpu, northAmerica, 275L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(motherboard, northAmerica, 1000L)).toString()));
//
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(cpu, europe, 50000L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(ssd, europe, 1000L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(gpu, europe, 800L)).toString()));
//			log.info("  - ".concat(regionalQuantityRepository.save(new RegionalQuantity(motherboard, europe, 700L)).toString()));
//			log.info("/ Finished setting quantities");
//
//			log.info("Finished adding demo Data");
//		};
//	}
}
