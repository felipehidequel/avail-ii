package questao1.Lanchonete;

import questao1.Sanduiche.Sanduiche;
import questao1.Sanduiche.SanduicheJp;

public class LanchoneteJp extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheJp();
    }    
}
