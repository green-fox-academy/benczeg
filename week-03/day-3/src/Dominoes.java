import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        List<Integer> orderOfIndex = new ArrayList<>();
        orderOfIndex.add(0);

        int j = 0;
        boolean isItNotOverYet = true;
        while (isItNotOverYet) {
            for (int i = 0; i < dominoes.size(); i++) {
                if (dominoes.get(j).getRightSide() == dominoes.get(i).getLeftSide()) {
                    j = i;
                    if (j == 0) {
                        isItNotOverYet = false;
                        break;
                    }
                    orderOfIndex.add(i);
                }
            }
        }


        List<Domino> dominoesInOrder = new ArrayList<>();
        for (
                int i = 0; i < orderOfIndex.size(); i++) {
            dominoesInOrder.add(dominoes.get(orderOfIndex.get(i)));
        }
        dominoes.clear();
        dominoes.addAll(dominoesInOrder);
        System.out.println(dominoes.toString());
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}