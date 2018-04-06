package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.tempDB.LoggedInFox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
  public String loginPost(@ModelAttribute(name = "name") String name, Model model) {
    if (name != null) {
      LoggedInFox.loggedInFox = name;
      return "redirect:/";
    } else {
      return "redirect:/login";
    }
  }
}


