package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.modell.Greeting;
import com.greenfoxacademy.springstart.modell.GreetingsHappened;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  /*Greeting greeting = new Greeting(0L, "Hello World");*/
  GreetingsHappened greetings = new GreetingsHappened();

  @GetMapping("/greeting")
  public String greeting(@RequestParam String name) {
    greetings.addGreeting(name);
    return ("Hello, " + name + "! This site was loaded " + greetings.getGreeting(name) +
        " times since last server start.");
  }
}
