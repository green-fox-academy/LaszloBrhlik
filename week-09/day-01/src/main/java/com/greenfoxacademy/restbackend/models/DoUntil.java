package com.greenfoxacademy.restbackend.models;

public class DoUntil {

  private int result;

  public DoUntil() {
  }

  public DoUntil(String what, Integer number) {
    if (what.equals("sum")) {
      sum(number);
    } else if (what.equals("factor")) {
      factor(number);
    }
  }

  public void sum(Integer number) {
    result = 0;
    for (int i = 1; i < number + 1; i++) {
      result += i;
    }
  }

  public void factor(Integer number) {
    result = 1;
    for (int i = 1; i < number + 1; i++) {
      result *= i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
