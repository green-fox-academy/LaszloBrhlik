package com.greenfoxacademy.guardians.controllers;

import com.greenfoxacademy.guardians.models.ErrorMessage;
import com.greenfoxacademy.guardians.models.Groot;
import com.greenfoxacademy.guardians.models.GrootResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianRestController {

  // Setting response HTTPStatus
  @GetMapping("/groot")
  public ResponseEntity<GrootResponse> iAmGroot(@RequestParam(name = "message", required = false) String someMessage) {
    if (someMessage == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Groot(someMessage));
    }
  }
}
