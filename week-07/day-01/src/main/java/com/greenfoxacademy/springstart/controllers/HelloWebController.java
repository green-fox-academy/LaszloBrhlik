package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting1")
  public String greeting1(Model model) {
    model.addAttribute("name", "World");
    return "greeting1";
    // @ResponseBody would return method's body not related .html
  }

  @RequestMapping("/web/greeting2")
  public String greeting2(Model model, @RequestParam("name") String content) {
    model.addAttribute("name", content);
    model.addAttribute("id", atomicLong.getAndIncrement());
    return "greeting2";
    // http://localhost:8080/web/greeting2?name=Laca
  }
}
