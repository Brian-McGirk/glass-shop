package com.example.glassshop.models.forms;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Art {

    @Id
    @GeneratedValue
    private int id;

    private ArtistName artistName;

    @NotNull(message = "Please include tracking number.")
    private Integer trackingNumber;

    @NotNull
    @Size(min = 1, message = "Please include a description of the art.")
    private String description;

    private ArtLocation location;

    @NotNull (message = "Please include the price for this art.")
    private Double price;


    //@OneToMany
    //private Art art;

    public Art(Integer trackingNumber, String description, Double price) {
        this.trackingNumber = trackingNumber;
        this.description = description;
        this.price = price;
    }

    public Art() { }

    public int getId() { return id; }

    public ArtistName getArtistName () { return artistName; }
    public void setArtistName (ArtistName artistName){ this.artistName = artistName; }

    public Integer getTrackingNumber () { return trackingNumber; }
    public void setTrackingNumber(Integer trackingNumber) { this.trackingNumber = trackingNumber; }

    public String getDescription () { return description; }
    public void setDescription (String description){ this.description = description; }

    public ArtLocation getLocation() { return location; }
    public void setLocation(ArtLocation location) { this.location = location; }

    public Double getPrice () { return price; }
    public void setPrice (Double price){ this.price = price; }

    }