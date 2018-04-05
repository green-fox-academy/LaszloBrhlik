package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful/colored")
  public String backgroundColor(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "useful";
  }
}
