package item;

import personnage.pokemons.Pokemon;

public class Pokeball {

    protected Pokemon Pokemon;

    public Pokeball() {
        this.Pokemon = null;
    }

    public Pokeball(Pokemon pokemon) {
        this.Pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return this.Pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        if(pokemon!= null) {
            this.Pokemon = pokemon;
        }
    }

}
