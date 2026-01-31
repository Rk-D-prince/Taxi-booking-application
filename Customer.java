/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author RAJA KANNAN
 */


public class Customer 
{

  private int customerId ;
  private char pickup;
  private char drop;
  private int pickTime;

  Customer(int id, char pickup, char drop, int pTime){
      this.customerId = id;
      this.pickup = pickup;
      this.drop = drop;
      this.pickTime = pTime;
  }

  public int getCustomerId(){
      return customerId;
  }

  public char getPickup(){
      return pickup;
  }

  public char getDrop(){
      return drop;
  }
  public int getPickTime(){
      return pickTime;
  }

}
