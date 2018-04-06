package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.models.Fox;
import org.springframework.stereotype.Service;

@Service
public interface FoxService {

  Fox login(String name);
  Fox getFox(String name);

}
