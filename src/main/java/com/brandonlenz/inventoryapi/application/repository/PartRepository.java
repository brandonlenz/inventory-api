package com.brandonlenz.inventoryapi.application.repository;

import com.brandonlenz.inventoryapi.application.model.Part;
import org.springframework.data.repository.CrudRepository;

public interface PartRepository extends CrudRepository<Part, Long> {
    Part findById(long Id);

    Iterable<Part> findAllBySku(String sku);

    Iterable<Part> findAllByName(String name);
}
