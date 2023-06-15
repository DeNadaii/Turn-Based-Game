import Classes.Guerreiro;
import Itens.Itens.PocaoCura;
import Personagem.Personagem;
import Raca.Humano;

public class Main {
    public static void main(String[] args) {

        Guerreiro g1 = new Guerreiro();
        Humano h1 = new Humano();
        System.out.println(g1.getForca());
        System.out.println(h1.getForca());

        Personagem p1 = new Personagem("bob",new Guerreiro(),new Humano());
        //p1.setArma(new Espada());
        System.out.println(p1.getForca());
        System.out.println(p1.atack());
        System.out.println("vida antes" + p1.getVida());
        PocaoCura pocao = new PocaoCura(p1);
        pocao.usarCura();
        System.out.println("vida depois" + p1.getVida());
    }
}