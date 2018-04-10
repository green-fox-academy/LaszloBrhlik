package com.greenfoxacademy.h2project.repositories;

import com.greenfoxacademy.h2project.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{
}
