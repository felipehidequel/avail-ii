package questao1.Lanchonete;

import questao1.Sanduiche.Sanduiche;
import questao1.Sanduiche.SanduicheRt;

public class LanchoneteRt extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheRt();
    }    
}
