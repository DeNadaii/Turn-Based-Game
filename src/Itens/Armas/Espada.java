package Itens.Armas;

public class Espada extends Arma{
    String nome;
    int dano = 5;
    public void nomearEspada(String nome){
        this.nome = nome;
    }
    public int getDano() { return dano; }
}
