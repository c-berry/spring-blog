package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_details")
public class PetDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String personalityDescription;

    private boolean isSterile;

    private int weightInOunces;

    public PetDetails(){}

    public PetDetails(long id, String personalityDescription, boolean isSterile, int weightInOunces) {
        this.id = id;
        this.personalityDescription = personalityDescription;
        this.isSterile = isSterile;
        this.weightInOunces = weightInOunces;
    }

    public PetDetails(String personalityDescription, boolean isSterile, int weightInOunces) {
        this.personalityDescription = personalityDescription;
        this.isSterile = isSterile;
        this.weightInOunces = weightInOunces;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonalityDescription() {
        return personalityDescription;
    }

    public void setPersonalityDescription(String personalityDescription) {
        this.personalityDescription = personalityDescription;
    }

    public boolean isSterile() {
        return isSterile;
    }

    public void setSterile(boolean sterile) {
        isSterile = sterile;
    }

    public int getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(int weightInOunces) {
        this.weightInOunces = weightInOunces;
    }
}
