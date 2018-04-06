package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Services.FoxService;
import com.greenfoxacademy.springstart.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showIndex(@RequestParam(name = "name") String name, Model model) {
    Fox fox = foxService.getFox(name);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@ModelAttribute(name = "name") String name) {
    Fox fox = foxService.login(name);
    if (fox != null) {
      return "redirect:/?name=" + name;
    } else {
      return "redirect:/login";
    }
  }

/*  @GetMapping("/{name}")
  public String indexWithName(@PathVariable(name = "name") String name, Model model) {
    Fox fox = foxService.login(name);
    model.addAttribute("name", name);
    return "index";
  }*/
}


