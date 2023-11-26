package com.hust.itep.aims.controller;

public class ValidateController {
  /**
   * This method validate customer's phone number.
   * 
   * @param phoneNumber phone number
   * @return boolean
   */
  public boolean validatePhoneNumber(String phoneNumber) {
    // verify if phone has 10 digits and start with 0
    if (phoneNumber.length() != 10 || phoneNumber.charAt(0) != '0') {
      return false;
    }
    // verify if phone contains only number
    try {
      Integer.parseInt(phoneNumber);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }


  /**
   * This medthod validate customer's name.
   * 
   * @param name name
   * @return boolean
   */
  public boolean validateName(String name) {
    if (name == null || name.trim().length() == 0 || name.equals("null")) {
      return false;
    }
    return name.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$");
  }


  /**
   * This method validate customer's address.
   * 
   * @param address address
   * @return boolean
   */
  public boolean validateAddress(String address) {
    if (address == null || address.trim().length() == 0 || address.equals("null")) {
      return false;
    }
    return address.matches("^[.0-9a-zA-Z\\s,-]+$");
  }
}
