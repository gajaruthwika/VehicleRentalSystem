package model;

//Customer Class

public class Customer {

 private String customerId;
 private String name;
 private String phone;

 // Composition

 private Address address;

 public Customer(String customerId, String name, String phone, Address address) {

     this.customerId = customerId;
     this.name = name;
     this.phone = phone;
     this.address = address;
 }

 // Copy Constructor

 public Customer(Customer c) {

     this.customerId = c.customerId;
     this.name = c.name;
     this.phone = c.phone;
     this.address = c.address;
 }

 // Encapsulation

 public String getCustomerId() {
     return customerId;
 }

 public void setCustomerId(String customerId) {
     this.customerId = customerId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getPhone() {
     return phone;
 }

 public void setPhone(String phone) {
     this.phone = phone;
 }

 public Address getAddress() {
     return address;
 }

 public void setAddress(Address address) {
     this.address = address;
 }

 // Inner Class

 public class Address {

     String city;
     String state;

     public Address(String city, String state) {

         this.city = city;
         this.state = state;
     }

     @Override
     public String toString() {

         return city + ", " + state;
     }
 }

 @Override
 public String toString() {

     return "Customer: " + name
             + ", ID: " + customerId
             + ", Phone: " + phone
             + ", Address: " + address;
 }
}
