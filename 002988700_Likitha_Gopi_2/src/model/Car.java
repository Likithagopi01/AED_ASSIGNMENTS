/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Likitha G
 */
public class Car {
   private String registration_date;
   private String occupied;
   private String brand;
   private int year;
   private String city;
   private int seats;
   private String serial_number;
   private String model_number;
   private int certi_year;
   private String time;

   
    public String getRegistration_date() {
        return registration_date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

   
    public String getOccupied() {
        return occupied;
    }

    public void setOccupied(String occiupied) {
        this.occupied = occiupied;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public int getCerti_year() {
        return certi_year;
    }

    public void setCerti_year(int certi_year) {
        this.certi_year = certi_year;
    }
    
    @Override
    public String toString(){
    return registration_date;
}

}
