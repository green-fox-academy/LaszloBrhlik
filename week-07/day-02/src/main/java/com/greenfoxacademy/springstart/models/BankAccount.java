package com.greenfoxacademy.springstart.models;

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
    currency = setCurrency();
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

  public void setBalance() {
    balance += 100;
    setCurrency();
  }

  public String setCurrency() {
    return currency = String.format("%.2f", balance) + " Zebra";
  }
}
