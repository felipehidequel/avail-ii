package questao1;

import questao1.Lanchonete.LanchoneteCreator;
import questao1.Lanchonete.*;


public class Main {
    public static void main(String[] args) {
        LanchoneteCreator lanchoneteRt = new LanchoneteRt();
        lanchoneteRt.criarSanduiche();
        lanchoneteRt.entregarSanduiche();


        LanchoneteCreator lanchoneteCg = new LanchoneteCg();
        lanchoneteCg.criarSanduiche();
        lanchoneteCg.entregarSanduiche();

        LanchoneteCreator lanchoneteJp = new LanchoneteJp();
        lanchoneteJp.criarSanduiche();
        lanchoneteJp.entregarSanduiche();    
    }
}
