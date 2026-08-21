package service;

import exception.InvalidBookingException;
import model.Customer;
import model.Vehicle;

//Interface

public interface BookingService {

 void bookVehicle(Vehicle v, Customer c, int days)
         throws InvalidBookingException;

 void cancelBooking(String vehicleNumber);

 Vehicle getBooking(String vehicleNumber);

 default void bookingMessage() {

     System.out.println("Vehicle booking service is active.");
 }
}