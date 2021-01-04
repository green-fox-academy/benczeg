import static java.lang.Character.isUpperCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
  public static void main(String[] args) throws IOException {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    System.out.println();
    numbers.stream().map(x -> x * x).forEach(System.out::println);
    System.out.println();
    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers2.stream().filter(x -> x * x > 20).forEach(System.out::println);
    System.out.println();
    OptionalDouble avg = numbers.stream().mapToInt(x -> x).average();
    if (avg.isPresent()) {
      System.out.println(avg.getAsDouble());
    } else {
      System.out.println("no value found");
    }
    System.out.println();
    List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    System.out.println(numbers3.stream().mapToInt(x -> x).sum());
    System.out.println();
    String findMyUpperCases = "asflnsdjbskSDFSDGasdasfDFSGasAWF";
    findMyUpperCases.chars().filter(Character::isUpperCase).mapToObj(Character::toString)
        .forEach(System.out::println);
    System.out.println();
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    char given = 'A';
    cities.stream().filter(String -> String.startsWith(Character.toString(given)))
        .forEach(System.out::println);
    System.out.println();
    List<Character> characters = Arrays.asList('a', 'b', 'c', 'd');
    System.out.println(characters.stream().map(Object::toString).collect(Collectors.joining()));
    System.out.println();
    String findFrequencyString = "almababanagyonfajaelmebajasebaj";
    Map<Character, Long> frequency =
        findFrequencyString.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(frequency);
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Gizi", "orange", 2));
    foxes.add(new Fox("Sanyi", "blue", 3));
    foxes.add(new Fox("Tibi", "yellow", 4));
    foxes.add(new Fox("Vuk", "green", 5));
    foxes.add(new Fox("Stack", "green", 1));
    foxes.stream().filter(fox -> fox.getColor().equals("green")).map(Fox::getName)
        .forEach(System.out::println);
    System.out.println();
    foxes.stream().filter(fox -> fox.getColor().equals("green")).filter(fox -> fox.age < 5)
        .map(Fox::getName).forEach(System.out::println);
    System.out.println();
    Map<String, Long> collect =
        foxes.stream().map(Fox::getColor)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(collect);
//
    List<String> linesOfPage = new ArrayList<>();
    URL oracle = new URL("http://wikiroulette.co/");
    BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
    String inputLine;
    while ((inputLine = in.readLine()) != null) {
      linesOfPage.add(inputLine);
    }
    in.close();

    char[] punctuation = {'.', ',', ';', ':', '?', '!', '"', '\'', ')', '(', '<', '>'};
    List<String> words = new ArrayList<>();
    for (String line : linesOfPage) {
      String[] wordBlock = line.split(" ");
      words.addAll(Arrays.asList(wordBlock));
    }
//
    String filename = "src/source.csv";
    File logFile = new File(filename);
    try (BufferedReader reader = new BufferedReader(new FileReader(logFile));) {
      StringBuilder fileContents = new StringBuilder();
      Stream<String> fileContentStream = reader.lines();
      fileContentStream.map(l -> l.split(";")).filter(s -> s[7].equals("male")).map(s -> s[0])
          .forEach(System.out::println);
    } catch (IOException ioe) {
      System.out.println("noob");
    }
  }
}
