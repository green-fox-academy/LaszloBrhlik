package com.greenfoxacademy.springstart.tempDB;

import com.greenfoxacademy.springstart.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxDB {

  List<Fox> foxes;

  public FoxDB() {
    foxes = new ArrayList<>(Arrays.asList(
            new Fox("Vuk"),
            new Fox("Vahur")
    ));
  }

  public Fox findOne(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }
}



