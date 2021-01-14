package foxclub.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String index() {
    return "login";
  }

  @PostMapping("/")
  public String indexPost(@RequestParam(value = "name", required = false,defaultValue = "noname") String name,
                          Model model) {
    if (name.equals("noname")) {
      return "login";
    } else {
      model.addAttribute("name", name);
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
}
