package Personagem;

import Classes.Classe;
import Raca.Raca;

public class Personagem{
    String nome;
    Classe classe;
    Raca raca;
    int forca;
    int inteligencia;
    int vida;

    public Personagem(String nome, Classe classe, Raca raca){
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        sumAtributs();
    }

    public void sumAtributs(){
        this.forca = classe.getForca() + raca.getForca();
        this.inteligencia = classe.getInteligencia() + raca.getInteligencia();
        this.vida = classe.getVida() + raca.getVida();
    }

    public int getForca() {
        return forca;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public int getVida() {
        return vida;
    }
}
