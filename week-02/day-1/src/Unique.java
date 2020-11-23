import java.util.Arrays;

//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once
public class Unique {
    public static String[] unique(String[] numbers) {
        String[] ratata = new String[8];
        int k = 0;
        for (int i = 0; i < 8; i++) {
            boolean pikachu = true;
            for (int j = i; 8 > j; j++) {
                if (numbers[i].equals(numbers[j])) {
                    pikachu = false;
                }
            }
            if (pikachu) {
                ratata[k] = numbers[i];
                k++;
            }


        }


        String[] cleared = new String[k];
        for (int i = 0; i < k; i++) {
            cleared[i] = ratata[i];
        }
        return cleared;
    }

    public static void main(String[] args) {
        int[] banana = {1, 11, 34, 11, 52, 61, 1, 34};
        String[] apple = Arrays.toString(banana).split(",");
        System.out.println(Arrays.toString(unique(apple)));
    }

}
