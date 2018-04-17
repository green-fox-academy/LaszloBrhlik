package com.greenfoxacademy.guardians.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groot implements GrootResponse {

  private String received;
  private String translated;

  public Groot() {
  }

  public Groot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }
}
