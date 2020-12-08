package Reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
  @Override
  public String getDowBooking() {
    Random random = new Random();
    String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return dow[random.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    List<String> characters = Arrays
        .asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
            "G", "H", "I", "J", "K", "L", "M", "N", "O"
            , "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    String newCode = "";
    Random random = new Random();
    for (int i = 0; i < 8; i++) {
      newCode = newCode + characters.get(random.nextInt(36));
    }
    return newCode;
  }
}
