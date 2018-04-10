package com.greenfoxacademy.h2project.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
}
