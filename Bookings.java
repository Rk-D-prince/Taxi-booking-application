/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class Bookings {
    private int bookingId;
    private int amount;
    private int dropTime;
    private Customer customer;
    
    Bookings(int bookingId, int amount, int dropTime, Customer customer){
        this.bookingId = bookingId;
        this.amount = amount;
        this.dropTime = dropTime;
        this.customer = customer;
    }
    
    public int getBookingId(){
        return bookingId;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public int getDropTime(){
        return dropTime;
    }
    
    public int getCustomerID(){
        return this.customer.getCustomerID();
    }
    
    public char getPickup(){
        return this.customer.getPickup();
    }
    
    public char getdrop(){
        return this.customer.getdrop(); 
    }
    
    public int getPickupTime(){
       return this.customer.getPickupTime(); 
    }
    
    
}
