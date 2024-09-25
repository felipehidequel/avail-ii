package questao1.Lanchonete;

import questao1.Sanduiche.Sanduiche;

public abstract class LanchoneteCreator {
    public abstract Sanduiche criarSanduiche();

    public void entregarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.montar();
        System.out.println("Sanduiche montado:" + sanduiche.toString());
    }
}
