package com.brandonlenz.inventoryapi.application.repository;

import com.brandonlenz.inventoryapi.application.model.Part;
import com.brandonlenz.inventoryapi.application.model.Region;
import com.brandonlenz.inventoryapi.application.model.RegionalQuantity;
import org.springframework.data.repository.CrudRepository;

public interface RegionalQuantityRepository extends CrudRepository<RegionalQuantity, Long> {
    Iterable<RegionalQuantity> findAllByRegion(Region region);

    Iterable<RegionalQuantity> findAllByPartId(Long partId);

    Iterable<RegionalQuantity> findAllByPartAndRegion(Part part, Region region);
}
