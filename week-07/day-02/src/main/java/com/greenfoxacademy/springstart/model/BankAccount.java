package com.greenfoxacademy.springstart.model;

public class BankAccount {
  String name;
  double balance;
  String animalType;
  String currency;
  boolean isKing;
  boolean isGood;

  public BankAccount(String name, double balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    currency = String.format("%.2f", balance) + " Zebra";
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public double setBalance() {
    return balance += 100;
  }
}
