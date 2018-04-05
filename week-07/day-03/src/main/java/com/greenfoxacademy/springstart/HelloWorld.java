package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld implements CommandLineRunner {

  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class, args);
    System.exit(0);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }
}
