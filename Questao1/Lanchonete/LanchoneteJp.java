package Questao1.Lanchonete;

import Questao1.Sanduiche.Sanduiche;
import Questao1.Sanduiche.SanduicheJp;

public class LanchoneteJp extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheJp();
    }    
}
