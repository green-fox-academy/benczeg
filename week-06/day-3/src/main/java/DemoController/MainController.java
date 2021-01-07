package DemoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping(method = RequestMethod.GET, value = "/")
  @ResponseBody
  public String hello() {
    return "hello";
  }

  @GetMapping("/hell")
  @ResponseBody
  public String hell() {
    return "hell";
  }

  @GetMapping("/asd")
  public String htmlHello(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    return "index";
  }

}
