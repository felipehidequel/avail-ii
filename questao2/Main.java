package questao2;

import questao2.Factory.SanduicheFactoryCg;
import questao2.Factory.SanduicheFactoryJp;
import questao2.Factory.SanduicheFactoryRt;
import questao2.Factory.SanduicheIngredientFactory;

public class Main {
    public static void main(String[] args) {
        ///Sanduiche Cg
        SanduicheIngredientFactory fabricaCg = new SanduicheFactoryCg();
        Cantina cantinaCg = new Cantina(fabricaCg);
        Sanduiche sanduicheCg = cantinaCg.pedirSanduiche();
        System.out.println(sanduicheCg);

        ///Sanduiche Jp
        SanduicheIngredientFactory fabricaJp = new SanduicheFactoryJp();
        Cantina cantinaJp = new Cantina(fabricaJp);
        Sanduiche sanduicheJp = cantinaJp.pedirSanduiche();
        System.out.println(sanduicheJp);

        //Sanduiche Rt
        SanduicheIngredientFactory fabricaRt = new SanduicheFactoryRt();
        Cantina cantinaRt = new Cantina(fabricaRt);
        Sanduiche sanduicheRt = cantinaRt.pedirSanduiche();
        System.out.println(sanduicheRt);

    }
}
