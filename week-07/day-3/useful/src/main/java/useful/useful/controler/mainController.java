package useful.useful.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import useful.useful.service.UtilityService;

@Controller
public class mainController {

  private UtilityService utilityService;

  @Autowired
  mainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("/useful/email")
  public String email(@RequestParam String email, Model model) {
    model = utilityService.validateEmail(email, model);
    return "email";
  }

  @GetMapping("/useful/encoder")
  public String encoder(Model model) {
    model.addAttribute("link", "encoder");
    return "coder";
  }

  @GetMapping("/useful/decoder")
  public String decoder(Model model) {
    model.addAttribute("link", "decoder");
    return "coder";
  }

  @PostMapping("/useful/result")
  public String result(@RequestParam String text, @RequestParam Integer number, String type,
                       Model model) {
    if (type.equals("encoder")) {
      model.addAttribute("result", utilityService.caesar(text, number));
    } else if (type.equals("decoder")) {
      model.addAttribute("result", utilityService.caesar(text, -number));
    }
    return "result";
  }
}
