package questao4.variantes;

import questao4.sanduiche.Sanduiche;

public class SanduicheGourmet extends SanduicheDecorator {

    public SanduicheGourmet(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Adicionando hamburguer gourmet de 180g");
    }

    @Override
    public String toString() {
        return super.toString() + " + hamburguer gourmet de 180g";
    }
}
