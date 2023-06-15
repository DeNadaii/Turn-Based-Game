package Itens.Itens;

import Personagem.Personagem;

public class PocaoCura extends Item{
    int Cura = 5;
    int usos;
    public PocaoCura(Personagem Usuario){
        this.usos = 3;
        this.usuario = Usuario;
    }
    public void usarCura(){
        int curaTotal = this.Cura + this.usuario.getVida();
        usuario.setVida(curaTotal);
        usos -= 1;
    }
}
