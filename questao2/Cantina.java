package questao2;

import questao2.Factory.SanduicheIngredientFactory;

public class Cantina {
    private SanduicheIngredientFactory fabrica;   

    public Cantina(SanduicheIngredientFactory fabrica){
        this.fabrica = fabrica;
    }

    public Sanduiche pedirSanduiche(){
        return new Sanduiche(fabrica);
    }
}
