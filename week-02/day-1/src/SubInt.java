import java.util.Arrays;

//nem tudom hogyan vágjam le a nullákat az eredmény végén. már null-ok lettet -.-
public class SubInt {

    public static String[] subInt(int q, int[] block) {
        String[] solution = new String[block.length];
        int k = 0;
        for (int i = 0; i < block.length; i++) {
            if (String.valueOf(block[i]).contains(String.valueOf(q))) {
                solution[k] = String.valueOf(i);
                k++;
            }
        }
        String[] cleared = new String[k];
        for (int i = 0; i < k; i++) {
            cleared[i] = solution[i];
        }
        return cleared;
    }


    public static void main(String[] args) {
        int[] nums = {1, 11, 34, 52, 61};
        System.out.println(Arrays.toString(subInt(1, nums)));
        System.out.println(Arrays.toString(subInt(9, nums)));

    }
}

