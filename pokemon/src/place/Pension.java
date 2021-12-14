package place;

import personnage.Dresseur;
import personnage.pokemons.Pokemon;

import java.util.ArrayList;

public class Pension {

    protected String Name;
    protected Dresseur Dresseur;
    protected int NbrMaxEnclos;
    protected ArrayList<Enclo> Enclos;

    public Pension(Dresseur dresseur, int nbrMaxEnclos) {
        this.Name = "Pension princiapl";
        this.Dresseur = dresseur;
        this.NbrMaxEnclos = nbrMaxEnclos;
        Enclos = new ArrayList<Enclo>();
    }

    public Pension(Dresseur dresseur) {
        this.Name = "Pension princiapl";
        this.Dresseur = dresseur;
        this.NbrMaxEnclos = 10;
        Enclos = new ArrayList<Enclo>();
    }

    public int getNbrPokemon() {
        int res = 0;
        for(Enclo enclo: this.Enclos) {
            res+= enclo.getPokemons().size();
        }
        return res;
    }

    public void printPokemons() {
        for(Enclo enclo: this.Enclos) {
            for(Pokemon pokemon : enclo.getPokemons()) {
                System.out.println(pokemon);
            }
        }
    }

    public void game() {
        //fonctionnement du jeu;
    }



    @Override
    public String toString() {
        return "Pension{" +
                "name='" + Name + '\'' +
                ", dresseur=" + Dresseur +
                ", nbrMaxEnclos=" + NbrMaxEnclos +
                ", Enclos=" + Enclos +
                '}';
    }
}
