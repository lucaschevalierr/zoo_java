package item;


import personnage.pokemons.Pokemon;

public class Bay implements Eatable{

    protected int NutritionalFactor;
    protected String Type;

    public Bay(int nutritionalFactor) {
        this.NutritionalFactor = nutritionalFactor;
    }


    public int getNutritionalFactor() {
        return this.NutritionalFactor;
    }


    @Override
    public void useOn(Pokemon pokemon) {
        int pokemonHunger = pokemon.getHungerIndicator();
        pokemonHunger += this.getNutritionalFactor();

        if(pokemonHunger > 100) pokemonHunger = 100;
        else if(pokemonHunger < 0) pokemonHunger = 0;

        pokemon.setHealthIndicator(pokemonHunger);
    }

    @Override
    public String toString() {
        return "Bay{" +
                "NutritionalFactor=" + NutritionalFactor +
                '}';
    }
}
