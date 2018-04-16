package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(name = "appendable", required = false) String input) {
    if (input != null) {
      return new AppendA(input);
    } else {
      return "";
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(name = "what", required = false) String what,
                        @RequestBody (required = false) Until until) {
    if (until == null) {
      return new ErrorMessage("Please provide a number!");
    } else {
      return new DoUntil(what, until.getUntil());
    }
  }
}
