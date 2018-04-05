package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

  UtilityService utilityService;

  @Autowired
  public EmailValidatorController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful/email")
  public String emailValidator(Model model, @RequestParam("email") String email) {
    // /useful/email?email=is@this.valid
    // is@this.valid is a valid email address in green
    // not_valid_email.com is not a valid email address in red
    if (utilityService.validateEmail(email)) {
      model.addAttribute("valid", true);
    } else {
      model.addAttribute("valid", false);
    }
    model.addAttribute("email", email);
    return "validemail";
  }
}
