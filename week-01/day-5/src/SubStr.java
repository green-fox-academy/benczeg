import java.util.Scanner;

// Create a function that takes two strings as a parameter
// Returns the starting index where
// the second one is starting in the first one
// Returns `-1` if the second string is not in the first one
public class SubStr {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me the first string line:");
        String input= scanner.nextLine();
        System.out.println("Please give me the string you looking for:");
        String q= scanner.nextLine();*/
        System.out.println(subStr("this is what I'm searching in", "searching"));
        System.out.println(subStr("this is what I'm searching in", "not"));

    }


    public static int subStr(String input, String q) {


        int found = -1;
        for (int i = 0; i < (input.length() - q.length()); i++) {
            String holder = input.substring(i, i + q.length());
            if (holder.equals(q)) {
                found = 17;
            }
        }
        return found;
    }
}

