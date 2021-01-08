package webshop.demo.controller;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webshop.demo.model.ItemList;
import webshop.demo.model.ShopItem;

@Controller
public class MainController {
  ItemList itemList = new ItemList();

  @GetMapping("")
  public String index(Model model) {
    model.addAttribute("list", itemList.getItemList());
    return "index";
  }

  @GetMapping("/available")
  public String available(Model model) {
    model.addAttribute("list",
        itemList.getItemList().stream().filter(n -> n.getQuantityOfStock() > 0).collect(
            Collectors.toList()));
    return "index";
  }

  @GetMapping("/cheapest")
  public String cheapest(Model model) {
    model.addAttribute("list",
        itemList.getItemList().stream().sorted(Comparator.comparing(ShopItem::getPrice)).
            collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("/nike")
  public String nike(Model model) {
    model.addAttribute("list",
        itemList.getItemList().stream().filter(n -> n.getName().toLowerCase().contains("nike") ||
            n.getDescription().toLowerCase().contains("nike")).
            collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("/average")
  public String average(Model model) {
    model.addAttribute("average",
        itemList.getItemList().stream().mapToInt(ShopItem::getQuantityOfStock).average()
            .getAsDouble());
    return "index";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {
    Optional<ShopItem> meh =
        itemList.getItemList().stream().max(Comparator.comparing(ShopItem::getPrice));
    if (meh.isPresent()) {
      model.addAttribute("name1", meh.get().getName());
      return "index";
    } else {
      model.addAttribute("name1", "your list is empty or something");
      return "index";
    }
  }
}
