package questao4.variantes;

import questao4.sanduiche.Sanduiche;

public class SanduicheVegano extends SanduicheDecorator {

    public SanduicheVegano(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public void montar() {
        sanduiche.montar();
        System.out.println("Substituindo ingredientes por opções veganas: sem presunto e queijo, adicionando brócolis.");
    }

    @Override
    public String toString() {
        String descricaoOriginal = sanduiche.toString();

        String descricaoSemPresuntoEQueijo = descricaoOriginal
            .replaceAll(",?\\s*queijo[^,]*", "")
            .replaceAll(",?\\s*presunto[^,]*", "");
        return descricaoSemPresuntoEQueijo + " + hamburguer de brócolis";
    }
}
