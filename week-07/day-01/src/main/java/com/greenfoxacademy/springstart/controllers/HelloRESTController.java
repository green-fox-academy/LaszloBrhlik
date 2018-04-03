package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController extends AtomicLong{

  @RequestMapping("/greeting1")
  public Greeting greeting1() {
    return new Greeting(1, "World");
  }

  @RequestMapping("/greeting2")
  public Greeting greeting2(@RequestParam("id") long id, @RequestParam("name") String content) {
    return new Greeting(id, content);
    // http://localhost:8080/greeting2?id=1&name=Laca
  }

  @RequestMapping("/greeting3")
  public Greeting greeting3(@RequestParam("name") String content) {
    return new Greeting(getAndIncrement(), content);
    // http://localhost:8080/greeting3?name=Laca
  }
}
