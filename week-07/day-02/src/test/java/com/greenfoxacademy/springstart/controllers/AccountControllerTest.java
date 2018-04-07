package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.tempDB.LionKingDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AccountControllerTest {

  @MockBean
  private LionKingDB lionKingDB;

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void serverStatusCodeIsOk() throws Exception {
    mockMvc.perform(get("/web/accounts"))
            .andExpect(status().isOk());
  }
}
