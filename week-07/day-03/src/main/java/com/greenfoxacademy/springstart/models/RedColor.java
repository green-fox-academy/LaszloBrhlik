package com.greenfoxacademy.springstart.models;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements MyColor{

  @Override
  public String printColor() {
    return "It is red in color...";
  }
}
