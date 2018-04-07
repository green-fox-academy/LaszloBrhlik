package com.greenfoxacademy.springstart.tempDB;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class LionKingDB {

  public List<BankAccount> accounts;

  @Autowired
  public LionKingDB() {
    accounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 4000, "lion", true),
            new BankAccount("Timon", 3000, "ophuzi mongoose", false),
            new BankAccount("Pumba", 2000, "pig", false),
            new BankAccount("Mufasa", 2000, "lion", false),
            new BankAccount("Scar", 1000, "lion", false)
    ));
  }
}
