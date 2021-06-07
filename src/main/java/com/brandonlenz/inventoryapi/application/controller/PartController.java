package com.brandonlenz.inventoryapi.application.controller;

import com.brandonlenz.inventoryapi.application.model.Part;
import com.brandonlenz.inventoryapi.application.repository.PartRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parts")
public class PartController {

    private final PartRepository partRepository;

    protected PartController(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @GetMapping("/")
    public Iterable<Part> getAllParts() {
        return partRepository.findAll();
    }
}
