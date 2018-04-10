package com.greenfoxacademy.mysqlproject.repositories;

import com.greenfoxacademy.mysqlproject.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long>{

  List<Todo> findAllByDoneIsFalseOrderById();
  List<Todo> findAllByOrderById();

}
