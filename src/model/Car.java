package model;

//Inheritance

public class Car extends Vehicle {

 private int numberOfDoors;

 public Car(String vehicleNumber, String brand, double rentPerDay, int numberOfDoors) {

     super(vehicleNumber, brand, rentPerDay);

     this.numberOfDoors = numberOfDoors;
 }

 // Method Overriding

 @Override
 public String getDetails() {

     return "Car: " + getBrand()
             + ", Vehicle No: " + getVehicleNumber()
             + ", Rent/Day: " + getRentPerDay()
             + ", Doors: " + numberOfDoors;
 }

 // Method Overloading

 public double calculateRent(int days, double discount) {

     double total = calculateRent(days);

     return total - discount;
 }

 @Override
 public String toString() {

     return getDetails();
 }

 @Override
 public boolean equals(Object obj) {

     if (this == obj)
         return true;

     if (!(obj instanceof Car))
         return false;

     Car c = (Car) obj;

     return getVehicleNumber().equals(c.getVehicleNumber());
 }
}