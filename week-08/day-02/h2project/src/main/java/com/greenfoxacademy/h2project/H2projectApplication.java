package com.greenfoxacademy.h2project;

import com.greenfoxacademy.h2project.models.Todo;
import com.greenfoxacademy.h2project.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2projectApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(H2projectApplication.class, args);
  }

  @Autowired
  private TodoRepository todoRepository;

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("I have to relax a lot"));
    todoRepository.save(new Todo("And eat"));
  }
}
