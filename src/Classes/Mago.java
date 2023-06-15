package Classes;

public class Mago extends Classe{
    public Mago(){
        this.forca = 3;
        this.inteligencia = 20;
        this.vida = 10;
        this.defesa = 3;
    }
    @Override
    public int getForca() { return inteligencia; }
    @Override
    public int getInteligencia() { return inteligencia; }
    @Override
    public int getVida() { return vida; }
    @Override
    public int getDefesa() { return defesa; }
}
