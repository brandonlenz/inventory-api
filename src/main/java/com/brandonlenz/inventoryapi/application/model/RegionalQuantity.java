package com.brandonlenz.inventoryapi.application.model;

import javax.persistence.*;

@Entity
public class RegionalQuantity {

    @Id
    @SequenceGenerator(
        name = "regional_quantity_generator",
        sequenceName = "regional_quantity_sequence"
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "regional_quantity_generator"
    )
    @Column(nullable = false)
    private Long id;

    @JoinColumn(name = "part_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Part part;

    @JoinColumn(name = "region_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;

    @Column(nullable = false)
    private Long quantity;

    protected RegionalQuantity() {
    }

    public RegionalQuantity(Part part, Region region, Long quantity) {
        this.part = part;
        this.region = region;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Part getPart() {
        return part;
    }

    public Region getRegion() {
        return region;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "RegionalQuantity{" +
                "id=" + id +
                ", part=" + part +
                ", region=" + region +
                ", quantity=" + quantity +
                '}';
    }
}
