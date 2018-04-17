package com.greenfoxacademy.guardians.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GuardianRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  // Lombok @getter @setter can not be used here
  @Test
  public void iAmGroot_whenParameterIsGivenThenExpectStatusOkAndGivenResponse() throws Exception{
    mockMvc.perform(get("/groot?message=some"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void iAmGroot_whenParameterIsNotGivenThenExpectBadRequestAndGivenResponse() throws Exception{
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error").value("I am Groot!"));
  }
}
