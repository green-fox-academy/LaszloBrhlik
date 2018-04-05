package com.greenfoxacademy.springstart.helloworld;

import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor{

  @Override
  public String printColor() {
    return "It is green in color...";
  }
}
