package questao4.lanchonete;

import questao4.sanduiche.Sanduiche;
import questao4.sanduiche.SanduicheRt;

public class LanchoneteRt extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheRt();
    }    
}
