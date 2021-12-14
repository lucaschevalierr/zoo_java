package personnage;

import personnage.pokemons.Pokemon;
import place.Enclo;

public class Dresseur {

    protected String Name;
    protected Sexe Sexe;
    protected int Age;

    public Dresseur(String name, Sexe sexe, int age) {
        this.Name = name;
        this.Sexe = sexe;
        this.Age = age;
    }

    public void exam(Enclo enclo) {
        System.out.println(enclo.toString());
    }

    public void clean(Enclo enclo) {

    }

    public void feed(Enclo enclo) {

    }

    public void transferTo(int numEncloLeave,int numEncloArrive, Pokemon pokemon) {

    }
}
