package questao2.Factory;

import questao2.Ingrediente.Pao.Pao;
import questao2.Ingrediente.Pao.PaoIntegral;
import questao2.Ingrediente.Presunto.Presunto;
import questao2.Ingrediente.Presunto.PresuntoFrango;
import questao2.Ingrediente.Queijo.Queijo;
import questao2.Ingrediente.Queijo.QueijoPrato;
import questao2.Ingrediente.Salada.Salada;
import questao2.Ingrediente.Salada.SemSalada;

public class SanduicheFactoryCg implements SanduicheIngredientFactory {
    public Pao criarPao() {
        return new PaoIntegral();
    }

    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    public Salada criarSalada() {
        return new SemSalada();
    }
    
}
