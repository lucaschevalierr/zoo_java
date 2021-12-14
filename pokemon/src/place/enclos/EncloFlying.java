package place.enclos;

import personnage.pokemons.Pokemon;
import personnage.pokemons.PokemonFlying;
import place.Enclo;
import place.Aviary;

public class EncloFlying extends Enclo {


    public EncloFlying(String name, int area, int nbPokemonMax) {
        super(name, area, nbPokemonMax);
    }

    public void add(PokemonFlying pokemon) {
        this.Pokemons.add(pokemon);
    }

}
