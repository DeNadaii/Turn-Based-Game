import Classes.Classe;
import Classes.Guerreiro;
import Personagem.Personagem;
import Raca.Humano;
import Raca.Raca;

public class Main {
    public static void main(String[] args) {

        Guerreiro g1 = new Guerreiro();
        Humano h1 = new Humano();
        System.out.println(g1.getForca());
        System.out.println(h1.getForca());

        Personagem p1 = new Personagem("bob",new Guerreiro(),new Humano());
        System.out.println(p1.getForca());
    }
}