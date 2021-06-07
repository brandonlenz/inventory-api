package com.brandonlenz.inventoryapi.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Part {

    @Id
    @SequenceGenerator(name = "part_generator", sequenceName = "part_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "part_generator")
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sku;

    protected Part() {}

    public Part(String name, String sku) {
        this.name = name;
        this.sku = sku;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
}
