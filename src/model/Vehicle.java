package model;

//Abstract Class with static block

public abstract class Vehicle {

 private String vehicleNumber;
 private String brand;
 private double rentPerDay;

 static String companyName;

 static {
     companyName = "SRITW Vehicle Rentals";
     System.out.println("Static block in Vehicle executed. Company set.");
 }

 public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
     this.vehicleNumber = vehicleNumber;
     this.brand = brand;
     this.rentPerDay = rentPerDay;
 }

 // Encapsulation

 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public void setVehicleNumber(String vehicleNumber) {
     this.vehicleNumber = vehicleNumber;
 }

 public String getBrand() {
     return brand;
 }

 public void setBrand(String brand) {
     this.brand = brand;
 }

 public double getRentPerDay() {
     return rentPerDay;
 }

 public void setRentPerDay(double rentPerDay) {
     this.rentPerDay = rentPerDay;
 }

 // Abstract method

 public abstract String getDetails();

 // Normal method

 public double calculateRent(int days) {
     return rentPerDay * days;
 }
}