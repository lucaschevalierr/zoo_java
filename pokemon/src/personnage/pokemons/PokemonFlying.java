package personnage.pokemons;

import personnage.Sexe;
import personnage.Type;

import java.util.ArrayList;

public abstract class PokemonFlying extends Pokemon {


    protected PokemonFlying(ArrayList<personnage.Type> type, String name, personnage.Sexe sexe, int age, int weight, double height, ArrayList<String> sounds) {
        super(type, name, sexe, age, weight, height, sounds);
    }
}
