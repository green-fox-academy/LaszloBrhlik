package com.greenfoxacademy.springstart;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BlueColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}
