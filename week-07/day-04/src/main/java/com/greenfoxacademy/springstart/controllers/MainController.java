package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {


  @GetMapping("/index")
  public String indexGet() {
    return "index";
  }

  @GetMapping("/login")
  public String loginGet() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost() {
    return "login";
  }

}
