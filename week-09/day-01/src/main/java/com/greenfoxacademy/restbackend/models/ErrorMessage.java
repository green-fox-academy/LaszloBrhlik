package com.greenfoxacademy.restbackend.models;

public class ErrorMessage {

  private String error;

  public ErrorMessage(String errorMessage) {
    this.error = errorMessage;
  }

  public String getErrorMessage() {
    return error;
  }

  public void setErrorMessage(String errorMessage) {
    this.error = errorMessage;
  }
}
