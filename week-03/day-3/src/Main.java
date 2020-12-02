import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostIt postIt = new PostIt();
        postIt.backgroundColor = "Pink";
        postIt.text = "Oh yeah!";
        postIt.textColor = "Black";

        BlogPost newpost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet", "2000.05.04.");
        BlogPost newpost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost,everything.", "2010.10.10.");
        BlogPost newpost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        Animal dog = new Animal();
        dog.drink();
        dog.eat();
        dog.play();
        System.out.println("hunger: " + dog.hunger + " thirst: " + dog.thirst);

        Sharpie pinky = new Sharpie("pink", 0.7);
        pinky.use();
        System.out.println(pinky.inkAmount);

        Counter tryCounter = new Counter(30);
        tryCounter.add(10);
        tryCounter.add();
        System.out.println(tryCounter.get());

        List<Pokemon> pokemonOfAsh = initializePokemons();

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?
        Pokemon chosenPokemon = null;
        for (Pokemon poke : pokemonOfAsh) {
            if (poke.isEffectiveAgainst(wildPokemon)) {
                chosenPokemon = new Pokemon(poke.name, poke.type, poke.effectiveAgainst);
            }
        }
        System.out.print("I choose you, " + chosenPokemon.name);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikachu", "electric", "water")); // fixed "-t"
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Squirtle", "water", "fire")); //fixed "-Balbasaur + Squirtle"
        pokemon.add(new Pokemon("Kingler", "water", "fire"));


        return pokemon;

    }
}
