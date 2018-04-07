package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);

  @RequestMapping(value = "/web/show")
  public String show(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("currency", bankAccount.getCurrency());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "simple";
  }
}
