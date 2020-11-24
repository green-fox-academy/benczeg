import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expences = new ArrayList<>();
        Integer[] adder = {500, 1000, 1250, 175, 800, 120};
        expences.addAll(Arrays.asList(adder));
        int count = 0; // could use size
        int min = expences.get(0);
        int max = 0;
        int sum = 0;
        for (Integer value : expences
        ) {
            sum = sum + value;
            count++;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("szum:" + sum + " min:" + min + " max:" + max + " avg:" + sum / count);
    }
}
