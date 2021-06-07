package com.brandonlenz.inventoryapi.application.repository;

import com.brandonlenz.inventoryapi.application.model.Region;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<Region, Long> {

}
