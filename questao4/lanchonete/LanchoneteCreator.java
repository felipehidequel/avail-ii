package questao4.lanchonete;

import questao4.sanduiche.Sanduiche;

public abstract class LanchoneteCreator {
    public abstract Sanduiche criarSanduiche();

    public void entregarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.montar();
        System.out.println("Sanduiche montado:" + sanduiche.toString());
    }
}
