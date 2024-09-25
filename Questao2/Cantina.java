package Questao2;

import Questao2.Factory.SanduicheIngredientFactory;

public class Cantina {
    private SanduicheIngredientFactory fabrica;   

    public Cantina(SanduicheIngredientFactory fabrica){
        this.fabrica = fabrica;
    }

    public Sanduiche pedirSanduiche(){
        return new Sanduiche(fabrica);
    }
}
