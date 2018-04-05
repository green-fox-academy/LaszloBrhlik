package com.greenfoxacademy.springstart.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BlueColor implements MyColor {

  @Override
  public String printColor() {
    return "It is blue in color...";
  }
}
