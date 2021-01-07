package com.greenfoxacademy.springstart.modell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GreetingsHappened {
  HashMap<String, Long> greetings = new HashMap<>();

  public void addGreeting(String name) {
    Greeting greeting = new Greeting(1L, name);
    if (greetings.containsKey(greeting.getcontent())) {
      greetings.put(greeting.getcontent(), greetings.get(greeting.getcontent()) + 1);
    } else {
      greetings.put(greeting.content, 1L);
    }
  }

  public Long getGreeting(String name) {
    return greetings.get(name);
  }

}
