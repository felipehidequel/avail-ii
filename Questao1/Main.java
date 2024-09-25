package Questao1;

import Questao1.Lanchonete.LanchoneteCreator;
import Questao1.Lanchonete.*;


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
