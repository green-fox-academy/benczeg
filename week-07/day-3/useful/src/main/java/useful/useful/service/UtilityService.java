package useful.useful.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service

public class UtilityService {

  private List<String> colors;
  private Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }

  public Model validateEmail(String email,Model model) {
    if (email.contains("@") && email.contains(".")) {
      model.addAttribute("color","green");
      model.addAttribute("text","is@this.valid is a valid email address");
      return model;
    } else {
      model.addAttribute("color","red");
      model.addAttribute("text","not a valid email address");
      return model;
    }
  }


}