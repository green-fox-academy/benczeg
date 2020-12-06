public class MiddleSquare {
    public static void main(String[] args) {

        int digits = 4;
        int seed = 9600;                //change seed here
        int testRun = 100;              //number of tries
        int results[] = new int[testRun];
        int i = 0;
        while (i != testRun && results[0] != seed && seed != 0) { // should check repetitions later (like 17,17,17...)
            results[i] = seed;
            String n = String.valueOf(seed * seed);
            while (n.length() < digits * 2) {
                n = "0" + n;
            }
            int start = (int) Math.floor(digits / 2);
            int end = start + digits;
            seed = Integer.parseInt(n.substring(start, end));
            //System.out.println(seed);                      // print the numbers here if you want
            i++;
        }
        System.out.println(i);
    }
}
