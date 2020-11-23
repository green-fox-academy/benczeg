public class Factorio {
    public static int factorio(int a) {
        int fact = a;
        for (int i = 1; i < a; i++) {
            fact *= (a - i);
        }
        return fact;
    }

    public static void main(String[] args) {
        int myNumber = 4;
        System.out.println(factorio(myNumber));
    }
}
