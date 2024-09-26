package questao1.Lanchonete;

import questao1.Sanduiche.Sanduiche;
import questao1.Sanduiche.SanduicheCg;

public class LanchoneteCg extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheCg();
    }    
}
