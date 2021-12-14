package item;


import personnage.pokemons.Pokemon;

public class Potion implements Eatable {

    private int Heal;

    public Potion(int heal) {
        this.Heal = heal;
    }

    public int getHeal() {
        return this.Heal;
    }

    @Override
    public void useOn(Pokemon pokemon) {
        int pokemonHealth = pokemon.getHealthIndicator();
        pokemonHealth += this.Heal;

        if(pokemonHealth > 100) pokemonHealth = 100;
        else if(pokemonHealth < 0) pokemonHealth = 0;

        pokemon.setHealthIndicator(pokemonHealth);
    }

    @Override
    public String toString() {
        return "Potion{" +
                "Heal=" + Heal +
                '}';
    }
}
