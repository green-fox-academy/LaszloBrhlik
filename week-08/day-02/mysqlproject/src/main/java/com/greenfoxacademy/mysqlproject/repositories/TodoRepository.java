package com.greenfoxacademy.mysqlproject.repositories;

import com.greenfoxacademy.mysqlproject.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{
}
