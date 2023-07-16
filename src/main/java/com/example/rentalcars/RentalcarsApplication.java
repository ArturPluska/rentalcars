package com.example.rentalcars;

import com.example.rentalcars.cars.BodyType;
import com.example.rentalcars.cars.CarModel;
import com.example.rentalcars.places.Place;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentalcarsApplication {

    public static void main(String[] args) {

        CarModel fCar = new CarModel("WK12345", "Opel", "Astra", "red", BodyType.HATCHBACK);
        CarModel sCar = new CarModel();
        sCar.setPlateNumber("DW54321");
        sCar.setBrand("Renault");
        sCar.setModel("Laguna");
        sCar.setColor("blue");
        sCar.setBodyType(BodyType.WAGON);

        Place fPlace = new Place("Warszafka", "Warsaw", "Listopada", "123", 50);
        Place sPlace = new Place();
        sPlace.setName("Poznaniak");
        sPlace.setCity("Poznan");
        sPlace.setStreet("Grunwaldzka");
        sPlace.setBuildingNumber("34");
        sPlace.setAvailableCarsNumber(23);

        System.out.println(fCar.getPlateNumber() + " " + fCar.getBrand() + " " + fCar.getModel() + " " + fCar.getColor() + " " + fCar.bodyType);
        System.out.println(sCar.getPlateNumber() + " " + sCar.getBrand() + " " + sCar.getModel() + " " + sCar.getColor() + " " + sCar.bodyType);
        System.out.println();
        System.out.println(fPlace.getName() + " " + fPlace.getCity() + " " + fPlace.getStreet() + " " + fPlace.getBuildingNumber() + " " + fPlace.getAvailableCarsNumber());
        System.out.println(sPlace.getName() + " " + sPlace.getCity() + " " + sPlace.getStreet() + " " + sPlace.getBuildingNumber() + " " + sPlace.getAvailableCarsNumber());

    }

}
