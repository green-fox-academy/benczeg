package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.modell.AddedGreetings;
import java.awt.Color;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomGreetingController {

  @RequestMapping("/random")
  public String randomGreet(@RequestParam String color, @RequestParam Integer size, Model model) {
    model.addAttribute(color, size);
    return "randomGreeting";
  }
}
