import item.Pokeball;
import personnage.pokemons.Pokemon;
import place.Enclo;
import pokemon.Pikachu;

public class main {

    public static void main(String[] args) {

        Pokemon Pikachu = new Pikachu();
        Pokeball pokeball = new Pokeball(Pikachu);
        pokeball.setPokemon(null);
        System.out.println(Pikachu);
        System.out.println(pokeball.getPokemon().toString());
        Enclo enclo = new Enclo("Nom", 100, 5);
        System.out.println(enclo.toString());
    }

}
