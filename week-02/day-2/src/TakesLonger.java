import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// When saving this quote a disk error has occurred. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String input = " always takes longer than";
        List<String> newQuote = new ArrayList<>();
        String[] words = quote.split(" ");
        newQuote.addAll(Arrays.asList(words));
        //for (String word : words) {
        //    newQuote.add(word);
        //}
        newQuote.add(3,input);
        quote = newQuote.toString();
        System.out.println(quote);
    }
}
