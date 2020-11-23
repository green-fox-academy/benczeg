public class matrix {
    public static void main(String[] args) {
        int numLength = 4;
        int[][] numbers = new int[numLength][numLength];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = 0;
            }
            numbers[i][i] = 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }
    }
}