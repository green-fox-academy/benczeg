public class Anagram {
    public static void main(String[] args) {
        String word1 = "this";
        String word2 = "shit";
        System.out.println(anagram(word1, word2));
    }

    public static boolean anagram(String letters1, String letters2) {
        if (letters1.length() == letters2.length()) {
            int[] booleans = new int[letters1.length()];
            for (int i = 0; i < letters1.length(); i++) {
                for (int j = 0; j < letters2.length(); j++) {
                    if (letters1.charAt(i) == letters2.charAt(j)) {
                        booleans[i] = 1;
                    }
                }
            }
            boolean anagramFinal = true;
            for (int i = 0; i < letters1.length(); i++) {
                if (booleans[i] == 0) {
                    anagramFinal = false;
                }
            }
            return anagramFinal;
        }
        return false;
    }
}
