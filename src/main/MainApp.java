package main;

import exception.InvalidBookingException;
import manager.VehicleRentalManager;
import model.Bike;
import model.Car;
import model.Customer;
import model.Vehicle;

//Driver Class

public class MainApp {

 public static void main(String[] args) {

     // Creating Address using inner class

     Customer customer = new Customer(
             "C001",
             "John",
             "9876543210",
             null
     );

     Customer.Address address =
             customer.new Address("Warangal", "Telangana");

     customer.setAddress(address);


     // Creating vehicles

     Vehicle car =
             new Car("CAR001", "Toyota", 2000, 4);

     Vehicle bike =
             new Bike("BIKE001", "Honda", 800, true);


     // Creating manager

     VehicleRentalManager manager =
             new VehicleRentalManager();


     // Interface default methods

     manager.bookingMessage();

     manager.maintenanceMessage();


     try {

         // Polymorphism

         manager.bookVehicle(car, customer, 3);


         // Bike booking using overloaded method

         manager.bookVehicle(bike, customer, 2, 200);


         System.out.println(
                 "Total Bookings: "
                 + VehicleRentalManager.getBookingCount());


         // Maintenance

         manager.sendForMaintenance(car);

         System.out.println(
                 "Under Maintenance: "
                 + manager.isUnderMaintenance("CAR001"));


         manager.completeMaintenance("CAR001");

         System.out.println(
                 "Under Maintenance: "
                 + manager.isUnderMaintenance("CAR001"));


         // Cancel booking

         manager.cancelBooking("BIKE001");


     } catch (InvalidBookingException e) {

         System.out.println(
                 "Error: " + e.getMessage());
     }
 }
}