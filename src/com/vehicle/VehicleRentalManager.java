package com.vehicle;

// Business Class

class VehicleRentalManager implements BookingService, MaintenanceTracker {

    private static int bookingCount = 0;

    public static final String RENTAL_COMPANY = "SRITW";

    private Vehicle bookedVehicle;
    private Customer bookedCustomer;

    private boolean underMaintenance = false;

    // Method Overloading

    public void bookVehicle(Vehicle v, Customer c, int days)
            throws InvalidBookingException {

        if (v == null || c == null || days <= 0) {

            throw new InvalidBookingException("Invalid booking data");
        }

        if (underMaintenance) {

            throw new InvalidBookingException(
                    "Vehicle is under maintenance");
        }

        bookedVehicle = v;
        bookedCustomer = c;

        bookingCount++;

        double rent = v.calculateRent(days);

        System.out.println("Booking successful.");
        System.out.println("Vehicle: " + v.getDetails());
        System.out.println("Customer: " + c.getName());
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + rent);
    }

    // Method Overloading

    public void bookVehicle(Vehicle v, Customer c, int days, double discount)
            throws InvalidBookingException {

        if (v == null || c == null || days <= 0) {

            throw new InvalidBookingException("Invalid booking data");
        }

        if (underMaintenance) {

            throw new InvalidBookingException(
                    "Vehicle is under maintenance");
        }

        bookedVehicle = v;
        bookedCustomer = c;

        bookingCount++;

        double rent = v.calculateRent(days);

        rent = rent - discount;

        System.out.println("Booking successful with discount.");
        System.out.println("Vehicle: " + v.getDetails());
        System.out.println("Customer: " + c.getName());
        System.out.println("Days: " + days);
        System.out.println("Discount: " + discount);
        System.out.println("Total Rent: " + rent);
    }

    @Override
    public void cancelBooking(String vehicleNumber) {

        if (bookedVehicle != null &&
                bookedVehicle.getVehicleNumber().equals(vehicleNumber)) {

            System.out.println("Booking cancelled for: "
                    + vehicleNumber);

            bookedVehicle = null;
            bookedCustomer = null;
        }
    }

    @Override
    public Vehicle getBooking(String vehicleNumber) {

        if (bookedVehicle != null &&
                bookedVehicle.getVehicleNumber().equals(vehicleNumber)) {

            return bookedVehicle;
        }

        return null;
    }

    // Maintenance methods

    @Override
    public void sendForMaintenance(Vehicle v) {

        underMaintenance = true;

        System.out.println(
                v.getVehicleNumber()
                + " sent for maintenance.");
    }

    @Override
    public void completeMaintenance(String vehicleNumber) {

        underMaintenance = false;

        System.out.println(
                vehicleNumber
                + " maintenance completed.");
    }

    @Override
    public boolean isUnderMaintenance(String vehicleNumber) {

        return underMaintenance;
    }

    public static int getBookingCount() {

        return bookingCount;
    }
}