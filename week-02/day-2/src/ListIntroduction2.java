import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        List<String> listB = new ArrayList<>();
        for (String line :
                listA) {
            listB.add(line);
        }
        System.out.println(listA.contains("Durian"));
        listA.remove("Durian");
        listA.add("Kiwi");
        if (listA.size() > listB.size()) {
            System.out.println("ListA is bigger");
        }
        if (listA.size() == listB.size()) {
            System.out.println("Equals");
        }
        if (listA.size() < listB.size()) {
            System.out.println("ListB is bigger");
        }
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        String[] otherlist = new String[]{"Fruit", "Pomelo"};
        listB.addAll(Arrays.asList(otherlist));
        System.out.println(listA.get(2));

    }
}
