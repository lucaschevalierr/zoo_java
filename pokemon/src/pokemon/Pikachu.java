package pokemon;

import personnage.pokemons.Pokemon;
import personnage.pokemons.PokemonEvolver;
import personnage.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class Pikachu extends Pokemon implements PokemonTerrestial, PokemonEvolver {

    public Pikachu() {

        super(
                new ArrayList<Type>(Arrays.asList(new Type[]{personnage.Type.Electric})),
                "Pikachu",
                Sexe.Male,
                1,
                7,
                40,
                new ArrayList<String>() {{
                    add("Pika Pika !!");
                }}
                );
    }

    @Override
    public void walk() {
        System.out.println(this.Name + " se déplace en marchant");
    }

    @Override
    public Pokemon getFirstEvolv() {
        return new Pikachu();
    }

    @Override
    public Pokemon evolve() {
        Pokemon.delete(this);
        return getFirstEvolv();
    }

}
