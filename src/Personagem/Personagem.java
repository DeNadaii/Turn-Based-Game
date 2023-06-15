package Personagem;

import Classes.Classe;
import Itens.Armas.Arma;
import Raca.Raca;

import java.util.List;

public class Personagem{
    String nome;
    Classe classe;
    Raca raca;
    Arma arma;
    int forca;
    int inteligencia;
    int vida;
    int defesa;
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
        this.defesa = classe.getDefesa() + raca.getDefesa();
    }
    public int atack(){
        int atack;
        if(arma != null){
            atack = arma.getDano() + this.forca;
        }else{
            atack = this.forca;
        }
        return atack;
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
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setArma(Arma arma){
        this.arma = arma;
    }
}
