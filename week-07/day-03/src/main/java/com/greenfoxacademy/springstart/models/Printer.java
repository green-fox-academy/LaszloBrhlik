package com.greenfoxacademy.springstart.models;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Printer {
  public String log(String message) {
    return LocalDateTime.now() + " MY PRINTER SAYS --- " + message;
  }
}
