package place;

import item.Bay;
import item.Eatable;
import item.Potion;
import personnage.pokemons.Pokemon;
import utils.functions;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Enclo {

    protected String Name;
    protected int Area;
    protected int NbPokemonMax;
    protected Cleanliness CleanIndicator;
    protected ArrayList<Pokemon> Pokemons;
    protected ArrayList<Eatable> Reserve;

    public Enclo(String name, int area, int nbPokemonMax) {
        this.Name = name;
        this.Area = area;
        this.NbPokemonMax = nbPokemonMax;
        this.CleanIndicator = Cleanliness.Clean;
        this.Pokemons = new ArrayList<Pokemon>();
        this.Reserve = new ArrayList<Eatable>();
    }

    public boolean remove (Pokemon pokemon) {
        for(Pokemon currentPokemon : this.Pokemons) {
            if (currentPokemon == pokemon) {
                this.Pokemons.remove(pokemon);
                return true;
            }
        }
        return false;
    }

    public void feed() {
        System.out.println("Bienvenue dans le menu pour nourriture vos pokémon, pour chaque pokémon de l'enclo vous pourez choisir les consomable de la réserver que vous souhaitez lui donner en fonction de son état : ");
        for(Pokemon pokemon : this.Pokemons) {
            System.out.println(pokemon.getName() + " : " + pokemon.getHealthIndicator() + "HP et :" + pokemon.getHungerIndicator() + "% de faim.");
            Scanner sc = new Scanner(System.in);
            int i = 0;
            for(; i < this.Reserve.size(); ++i) {
                System.out.println(i + " : " + this.Reserve.get(i));
            }
            System.out.println(i+1 + " : Passer au prochain pokémon");
            int index = sc.nextInt();
            pokemon.eat(this.Reserve.get(index));
            //Eatable eatable = functions.getRandomElement(this.Reserve);
            //if(eatable != null) {
            //    pokemon.eat(eatable);
            //}
        }
    }

    public void maintain() {
        this.CleanIndicator = Cleanliness.Clean;

        for(int i = 0; i < Pokemons.size(); ++i) {
            int rdm = functions.getRandomInt(0, 1);
            for(int j = 0; j < rdm; ++j) {
                this.Reserve.add(new Potion(functions.getRandomInt(10, 50)));
            }

            rdm = functions.getRandomInt(0, 1);
            for(int j = 0; j < rdm; ++j) {
                this.Reserve.add(new Bay(functions.getRandomInt(10, 50)));
            }
        }
    }


    public ArrayList<Pokemon> getPokemons() {
        return this.Pokemons;
    }

    @Override
    public String toString() {
        return "Enclo{" +
                "Name='" + Name + '\'' +
                ", Area=" + Area +
                ", NbPokemonMax=" + NbPokemonMax +
                ", NbPokemonIn=" + Pokemons.size() +
                ", CleanIndicator=" + CleanIndicator +
                '}';
    }
}
