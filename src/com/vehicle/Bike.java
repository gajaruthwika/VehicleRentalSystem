package com.vehicle;
//Inheritance

class Bike extends Vehicle {

 private boolean hasGear;

 public Bike(String vehicleNumber, String brand, double rentPerDay, boolean hasGear) {

     super(vehicleNumber, brand, rentPerDay);

     this.hasGear = hasGear;
 }

 // Method Overriding

 @Override
 public String getDetails() {

     return "Bike: " + getBrand()
             + ", Vehicle No: " + getVehicleNumber()
             + ", Rent/Day: " + getRentPerDay()
             + ", Gear: " + hasGear;
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

     if (!(obj instanceof Bike))
         return false;

     Bike b = (Bike) obj;

     return getVehicleNumber().equals(b.getVehicleNumber());
 }
}