package foxclub.foxclub.controller;

import foxclub.foxclub.model.Drink;
import foxclub.foxclub.model.Food;
import foxclub.foxclub.model.Pet;
import foxclub.foxclub.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  PetService petService;
  Pet pet;

  @Autowired
  public MainController() {
    petService = new PetService();
  }

  @GetMapping("/")
  public String index() {
    return "login";
  }

  @PostMapping("/")
  public String indexPost(
      @RequestParam(value = "name", required = false, defaultValue = "noname") String name,
      Model model) {
    if (name.equals("noname")) {
      return "login";
    } else {
      pet = new Pet(name);
      model.addAttribute("pet", pet);
      model.addAttribute("tricksnum", pet.getTricksNum());
      return "index";
    }
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "redirect:/index";
  }

  @GetMapping("/nutrition")
  public String nutritionOpen(Model model) {
    model.addAttribute("drinks", petService.getDrinkList());
    model.addAttribute("foods", petService.getFoodList());
    return "nutrition";
  }

  @PostMapping("/nutrition")
  public String nutritionAdd(@RequestParam Food food, Drink drink, Model model) {
    pet.setDrink(drink);
    pet.setFood(food);
    model.addAttribute("pet", pet);
    model.addAttribute("tricksnum", pet.getTricksNum());
    return "index";
  }
}
