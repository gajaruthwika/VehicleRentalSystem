package service;

import model.Vehicle;

public interface MaintenanceTracker {

    void sendForMaintenance(Vehicle v);

    void completeMaintenance(String vehicleNumber);

    boolean isUnderMaintenance(String vehicleNumber);

    default void maintenanceMessage() {

        System.out.println("Vehicle maintenance tracker is active.");
    }
}