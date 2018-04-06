package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.models.Fox;
import com.greenfoxacademy.springstart.tempDB.FoxDB;
import com.greenfoxacademy.springstart.tempDB.LoggedInFox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoxServiceImpl implements FoxService {

  private FoxDB foxDB;

  @Autowired
  public FoxServiceImpl(FoxDB foxDB) {
    this.foxDB = foxDB;
  }

  @Override
  public Fox login(String name) {
    Fox fox = foxDB.findOne(name);
    if (fox != null) {
      LoggedInFox.loggedInFox = fox;
    }
    return fox;
  }

  @Override
  public Fox getFox(String name) {
    Fox fox = foxDB.findOne(name);
    return fox;
  }
}
