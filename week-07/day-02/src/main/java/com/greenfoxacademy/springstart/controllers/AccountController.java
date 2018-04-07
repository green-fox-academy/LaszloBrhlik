package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.tempDB.LionKingDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

  public LionKingDB lionKingDB;

  @Autowired
  public AccountController(LionKingDB lionKingDB) {
    this.lionKingDB = lionKingDB;
  }

  @GetMapping("/web/accounts")
  public String show(Model model) {
    model.addAttribute("accounts", lionKingDB.accounts);
    return "accounts";
  }

  @PostMapping("/web/accounts")
  public String donate() {
    lionKingDB.accounts.stream()
            .forEach(account -> account.setBalance());
    return "redirect:/web/accounts";
  }
}
