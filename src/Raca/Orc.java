package Raca;

public class Orc extends Raca{
    public Orc(){
        this.forca = 10;
        this.inteligencia = 2;
        this.vida = 15;
        this.defesa = 3;
    }
    @Override
    public int getForca() {
        return forca;
    }
    @Override
    public int getInteligencia() {
        return inteligencia;
    }
    @Override
    public int getVida() {
        return vida;
    }
}
