package questao4.lanchonete;

import questao4.sanduiche.Sanduiche;
import questao4.sanduiche.SanduicheCg;

public class LanchoneteCg extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheCg();
    }    
}
