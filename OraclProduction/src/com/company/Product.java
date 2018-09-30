/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Sept. 29, 2018
 *
 * Abstract class that implements Item interface.
 * Has methods to set and return the serial number,
 * production number, name, and the date
 * manufactured for the product.
 *
 ************************************************/

package com.company;

import java.util.Date;

public abstract class Product implements Item {

  // Starting production number at 1
  int currentProductionNumber = 1;
  int serialNumber;
  Date manufacturedOn;
  String name;

  public Product(String name) {
    this.name = name;
    // Setting the serial number to the current production number
    serialNumber = currentProductionNumber;

    // Incrementing production number
    currentProductionNumber++;

    // Setting date to current date
    manufacturedOn = new Date(System.currentTimeMillis());
  }

  public void setProductionNumber(int newValue) {
    currentProductionNumber = newValue;
  }

  // Setting name for product
  public void setName(String name) {
    this.name = name;
  }

  // Getting product name
  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    //Malicious code vulnerability
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  /*
  overriding toString method so it prints out the manufacturer, serial number, date,
  and name of the product
   */
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number: " + serialNumber + "\n" +
        "Date: " + manufacturedOn + "\n" +
        "Name: " + name + "\n";
  }
}
