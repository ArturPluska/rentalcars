package com.example.rentalcars;

import com.example.rentalcars.cars.BodyType;
import com.example.rentalcars.cars.CarModel;
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

        System.out.println(fCar.getPlateNumber() + " " + fCar.getBrand() + " " + fCar.getModel() + " " + fCar.getColor() + " " + fCar.bodyType);
        System.out.println(sCar.getPlateNumber() + " " + sCar.getBrand() + " " + sCar.getModel() + " " + sCar.getColor() + " " + sCar.bodyType);

    }

}
