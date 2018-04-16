package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import com.greenfoxacademy.restbackend.models.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(
          @RequestParam(name = "name", required = false) String name,
          @RequestParam(name = "title", required = false) String title
  ) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greet(name, title);
    }
  }
}
