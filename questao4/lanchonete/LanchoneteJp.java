package questao4.lanchonete;

import questao4.sanduiche.Sanduiche;
import questao4.sanduiche.SanduicheJp;

public class LanchoneteJp extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheJp();
    }    
}
