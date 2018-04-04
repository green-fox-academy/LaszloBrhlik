package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MultipleAccountController {
  BankAccount bankAccount1 = new BankAccount("Simba", 4000, "lion", true);
  BankAccount bankAccount2 = new BankAccount("Timon", 3000, "ophuzi mongoose",false);
  BankAccount bankAccount3 = new BankAccount("Pumba", 2000, "pig",false);
  BankAccount bankAccount4 = new BankAccount("Mufasa", 2000, "lion",false);
  BankAccount bankAccount5 = new BankAccount("Scar", 1000, "lion",false);
  List<BankAccount> bankAccounts = Arrays.asList(bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5);

  @RequestMapping(value = "/web/showmultiple")
  public String show(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "showmultiple";
  }
}
