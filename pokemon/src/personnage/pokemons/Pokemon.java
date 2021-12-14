package personnage.pokemons;

import item.Eatable;
import personnage.Egg;
import personnage.Sexe;
import personnage.Type;
import utils.functions;

import java.util.ArrayList;

public abstract class Pokemon {

    protected String Name;
    protected ArrayList<Type> Type;
    protected personnage.Sexe Sexe;
    protected int Age;
    protected int Weight;
    protected double Height;
    protected ArrayList<String> Sounds;
    protected boolean Awake;
    protected int HungerIndicator;
    protected int SleepIndicator;
    protected int HealthIndicator;



    protected Pokemon(ArrayList<Type> type, String name, Sexe sexe, int age, int weight, double height, ArrayList<String> sounds) {
        this.Type = type;
        this.Name = name;
        this.Sexe = sexe;
        this.Age = age;
        this.Weight = weight;
        this.Height = height;
        this.Sounds = sounds;
        this.Awake = true;
        this.HungerIndicator = 100;
        this.SleepIndicator = 100;
        this.HealthIndicator = 100;
    }

    protected static void delete(Pokemon pokemon) {
        pokemon = null;
    }

    public void eat(Eatable eatable) {
        eatable.useOn(this);
        if(this.HungerIndicator > 100) this.HungerIndicator = 100;
        else if(this.HungerIndicator < 0) this.HungerIndicator = 0;
        eatable = null;
    }


    public void sleep(int time) {
        this.Awake = false;

        this.SleepIndicator += time/60 * 10;
        if(this.SleepIndicator > 100) this.SleepIndicator = 100;
        else if(this.SleepIndicator < 0) this.SleepIndicator = 0;
    }

    public void wakeUp() {
        this.Awake = true;
    }

    public boolean isAwake() {
        return this.Awake;
    }

    private Pokemon getFirstEvolv() {
        return this;
    }

    public Egg lay() {
        if(this.Sexe == Sexe.Female) {
            return new Egg(this.getFirstEvolv());
        }
        return null;
    }



    public void sound() { //Add sound enum to property
        System.out.println(functions.getRandomElement(this.Sounds));
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Sexe=" + Sexe +
                ", Weight=" + Weight +
                ", Height=" + Height +
                ", HungerIndicator=" + HungerIndicator +
                ", SleepIndicator=" + SleepIndicator +
                ", Health=" + HealthIndicator +
                '}';
    }

    public String getName() {
        return this.Name;
    }

    public int getHealthIndicator() {
        return this.HealthIndicator;
    }

    public void setHealthIndicator(int healthIndicator) {
        this.HealthIndicator = healthIndicator;
    }

    public int getHungerIndicator() {
        return this.HungerIndicator;
    }

    public void getHungerIndicator(int hungerIndicator) {
        this.HungerIndicator = hungerIndicator;
    }
}
