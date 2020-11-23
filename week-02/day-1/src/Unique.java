import java.util.Arrays;

//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once
public class Unique {
    public static int[] unique(int[] numbers) {
        int[] unikums = new int[numbers.length];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            int alma = numbers[i];
            for (int j = 0; j < unikums.length; j++) {
                if (unikums[j] == 0 || k == unikums[j]) {
                } else {
                    unikums[i] = alma;
                    k++;
                }
            }
        }
        int[] cleared = new int[k];
        for (int i = 0; i < k; i++) {
            cleared[i] = unikums[i];
        }
        return cleared;
    }

    public static void main(String[] args) {
        int[] banana = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(unique(banana)));
    }

}
