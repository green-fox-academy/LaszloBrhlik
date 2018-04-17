package com.greenfoxacademy.guardians.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage implements GrootResponse{

  private String error;

  public ErrorMessage() {
  }

  public ErrorMessage(String error) {
    this.error = error;
  }
}
