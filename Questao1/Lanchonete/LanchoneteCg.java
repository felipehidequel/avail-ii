package Questao1.Lanchonete;

import Questao1.Sanduiche.Sanduiche;
import Questao1.Sanduiche.SanduicheCg;

public class LanchoneteCg extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheCg();
    }    
}
