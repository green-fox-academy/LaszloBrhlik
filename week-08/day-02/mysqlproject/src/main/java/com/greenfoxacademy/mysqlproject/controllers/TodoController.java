package com.greenfoxacademy.mysqlproject.controllers;

import com.greenfoxacademy.mysqlproject.models.Todo;
import com.greenfoxacademy.mysqlproject.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsFalseOrderById());
      return "todoslist";
    } else {
      model.addAttribute("todos", todoRepository.findAllByOrderById());
      return "todoslist";
    }
  }

  @GetMapping(value = "/add")
  public String showAddPage() {
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute(name = "todotitle") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/todo/";
  }
}
