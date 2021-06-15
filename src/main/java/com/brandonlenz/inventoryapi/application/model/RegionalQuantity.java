package com.brandonlenz.inventoryapi.application.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RegionalQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column
    private Date receivedDate;

    protected RegionalQuantity() {
    }

    public RegionalQuantity(Part part, Region region, Long quantity, Date receivedDate) {
        this.part = part;
        this.region = region;
        this.quantity = quantity;
        this.receivedDate = receivedDate;
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

    public Date getReceivedDate() {
        return receivedDate;
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
                ", receivedDate=" + receivedDate +
                '}';
    }
}
