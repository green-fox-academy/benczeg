package webshop.demo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemList {
  List<shopItem> itemList = new ArrayList<>();
  Pattern pattern = Pattern.compile(";");

  public ItemList() {
    {
      try {
        Stream<String> lines = Files.lines(Path.of("shopItems.csv"));
        List<shopItem> items = lines.skip(1).map(line -> {
          String[] arr = pattern.split(line);
          return new shopItem(
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
}
