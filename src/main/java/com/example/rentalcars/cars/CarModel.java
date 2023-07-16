package com.example.rentalcars.cars;

public class CarModel {

    public String plateNumber;
    public String brand;
    public String model;
    public String color;
    public BodyType bodyType;

    public CarModel(
            String plateNumber,
            String brand,
            String model,
            String color,
            BodyType bodyType
    ) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
    }

    public CarModel() {}

    public String getPlateNumber() {return plateNumber; }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public BodyType getBodyType() {
        return bodyType;
    }

    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

}
