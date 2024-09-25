package Questao1.Lanchonete;

import Questao1.Sanduiche.Sanduiche;
import Questao1.Sanduiche.SanduicheRt;

public class LanchoneteRt extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheRt();
    }    
}
