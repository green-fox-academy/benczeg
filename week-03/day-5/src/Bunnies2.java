// We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).


public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnies(10));
    }

    public static int bunnies(int bunn) {
        int total = 0;
        if (bunn % 2 == 1) {
            int ears = 2;
            if (bunn == 1) {
                total = ears;
            } else {
                total = ears + bunnies(bunn - 1);
            }
        }
        if (bunn % 2 == 0) {
            int ears2 = 3;
            if (bunn == 0) {
            } else {
                total = ears2 + bunnies(bunn - 1);
            }
        }
        return total;
    }
}
