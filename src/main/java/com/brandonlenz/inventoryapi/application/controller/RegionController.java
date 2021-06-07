package com.brandonlenz.inventoryapi.application.controller;

import com.brandonlenz.inventoryapi.application.model.Region;
import com.brandonlenz.inventoryapi.application.repository.RegionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regions")
public class RegionController {

    private final RegionRepository regionRepository;

    public RegionController(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("/")
    public Iterable<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}
