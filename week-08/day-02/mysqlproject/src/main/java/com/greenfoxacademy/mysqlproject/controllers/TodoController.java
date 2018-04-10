package com.greenfoxacademy.mysqlproject.controllers;

import com.greenfoxacademy.mysqlproject.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping(value = {"/", "list"})
  public String list(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());
      return "todoslist";
    } else {
      model.addAttribute("todos", todoRepository.findAll());
      return "todoslist";
    }
  }
}
