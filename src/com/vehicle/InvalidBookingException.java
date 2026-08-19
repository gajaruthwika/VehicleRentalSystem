package com.vehicle;

//Custom Exception

class InvalidBookingException extends Exception {

 public InvalidBookingException(String message) {

     super(message);
 }
}
