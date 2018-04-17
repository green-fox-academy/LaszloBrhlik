package com.greenfoxacademy.guardians.models;

public class ErrorMessage implements GrootResponse{

  private String error;

  public ErrorMessage() {
  }

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
