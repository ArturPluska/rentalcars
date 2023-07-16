package com.example.rentalcars.places;

public class Place {

    public String name;
    public String city;
    public String street;
    public String buildingNumber;
    public int availableCarsNumber;

    public Place(
            String name,
            String city,
            String street,
            String buildingNumber,
            int availableCarsNumber
    ) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.availableCarsNumber = availableCarsNumber;
    }

    public Place() {}

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getBuildingNumber() {
        return buildingNumber;
    }
    public int getAvailableCarsNumber() {
        return availableCarsNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
    public void setAvailableCarsNumber(int availableCarsNumber) {
        this.availableCarsNumber = availableCarsNumber;
    }

}
