public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] + numList[i];
            System.out.println(numList[i]);
        }
        //System.out.println();
        //for (int i = 0; i < numList.length; i++) {
        //  System.out.print(numList[i] + " ");
        //}
    }
}
