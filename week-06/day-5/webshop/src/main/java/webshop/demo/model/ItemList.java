package webshop.demo.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemList {
  List<ShopItem> itemList = new ArrayList<>();

  public ItemList() {
    {
      try {
        Stream<String> lines = Files.lines(Path.of("src/main/resources/static/shopItems.csv"));
        List<ShopItem> items = lines.skip(1).map(line -> {
          String[] arr = line.split(";");
          return new ShopItem(
              arr[0],
              arr[1],
              Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
        }).collect(Collectors.toList());
        this.itemList.addAll(items);
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Couldnt read ot something went wrong");
      }
    }
  }

  public List<ShopItem> getItemList() {
    return itemList;
  }

  public void setItemList(List<ShopItem> itemList) {
    this.itemList = itemList;
  }
}
