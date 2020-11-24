import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            count++;
            System.out.println(count + ". " + names.get(i));
        }
        names.remove(1);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size() - i - 1));
        }
        for (int i = 0; i < names.size(); i++) {
            names.remove(i);
        }
    }
}
