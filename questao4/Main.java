package questao4;

import questao4.lanchonete.*;
import questao4.sanduiche.*;
import questao4.variantes.*;


public class Main {
    public static void main(String[] args) {

        LanchoneteCg lanchoneteCg = new LanchoneteCg();
        Sanduiche sanduicheCg = lanchoneteCg.criarSanduiche();
        sanduicheCg.montar();
        System.out.println(sanduicheCg.toString());
        System.out.println("__________________");

        Sanduiche sanduicheGourmetCg = new SanduicheGourmet(sanduicheCg);
        sanduicheGourmetCg.montar();
        System.out.println(sanduicheGourmetCg.toString());
        System.out.println("__________________");

        Sanduiche sanduicheVeganoCg = new SanduicheVegano(sanduicheCg);
        sanduicheVeganoCg.montar();
        System.out.println(sanduicheVeganoCg.toString());
        System.out.println("__________________");

        LanchoneteRt lanchoneteRt = new LanchoneteRt();
        Sanduiche sanduicheRt = lanchoneteRt.criarSanduiche();
        sanduicheRt.montar();
        System.out.println(sanduicheRt.toString());
        System.out.println("__________________");

        Sanduiche sanduicheGourmetRt = new SanduicheGourmet(sanduicheRt);
        sanduicheGourmetRt.montar();
        System.out.println(sanduicheGourmetRt.toString());
        System.out.println("__________________");

        Sanduiche sanduicheVeganoRt = new SanduicheVegano(sanduicheRt);
        sanduicheVeganoRt.montar();
        System.out.println(sanduicheVeganoRt.toString());
        System.out.println("__________________");

    }
}
