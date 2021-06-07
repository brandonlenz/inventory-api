package com.brandonlenz.inventoryapi.application.controller;

import com.brandonlenz.inventoryapi.application.model.RegionalQuantity;
import com.brandonlenz.inventoryapi.application.repository.RegionalQuantityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/quantities")
public class RegionalQuantityController {

    private final RegionalQuantityRepository regionalQuantityRepository;

    public RegionalQuantityController(RegionalQuantityRepository regionalQuantityRepository) {
        this.regionalQuantityRepository = regionalQuantityRepository;
    }

    @GetMapping("/")
    public Iterable<RegionalQuantity> getAllRegionalQuantities() {
        return regionalQuantityRepository.findAll();
    }

    @GetMapping("")
    public Iterable<RegionalQuantity> getAllByPartId(@RequestParam String partId) {
        try {
            Long id = Long.parseLong(partId);
            return regionalQuantityRepository.findAllByPartId(id);
        } catch(NumberFormatException ignored) {
            return new ArrayList<>();
        }
    }
}
