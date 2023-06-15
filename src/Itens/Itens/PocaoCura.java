package Itens.Itens;

import Personagem.Personagem;

public class PocaoCura extends Item{
    int Cura = 5;
    int usos = 3;
    public PocaoCura(Personagem Usuario){
        this.usuario = Usuario;
    }
    public void usarCura(){
        int curaTotal = this.Cura + this.usuario.getVida();
        usuario.setVida(curaTotal);
        usos -= 1;
    }
}
