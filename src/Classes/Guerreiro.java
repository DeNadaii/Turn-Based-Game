package Classes;

public class Guerreiro extends Classe {
    public Guerreiro() {
        this.forca = 5;
        this.inteligencia = 3;
        this.vida = 15;
        this.defesa = 5;
    }
    @Override
    public int getForca() {
        return forca;
    }
    @Override
    public int getInteligencia() { return inteligencia; }
    @Override public int getVida() { return vida; }
}
