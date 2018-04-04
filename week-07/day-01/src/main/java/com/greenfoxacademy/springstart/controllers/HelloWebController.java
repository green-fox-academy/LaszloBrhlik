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

  @RequestMapping("/web/greeting3")
  public String greeting3(Model model) {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
            "Goede dag", "Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha",
            "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai",
            "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao",
            "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    model.addAttribute("hellos", hellos);
    return "greeting3";
    // http://localhost:8080/web/greeting3
  }

  @RequestMapping(value = "/web/show")
  public String show(Model model) {
    model.addAttribute("name", "aaa";
    return "showController";

}
