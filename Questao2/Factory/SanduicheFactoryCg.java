package Questao2.Factory;

import Questao2.Ingrediente.Pao.Pao;
import Questao2.Ingrediente.Pao.PaoIntegral;
import Questao2.Ingrediente.Queijo.Queijo;
import Questao2.Ingrediente.Queijo.QueijoPrato;
import Questao2.Ingrediente.Presunto.Presunto;
import Questao2.Ingrediente.Presunto.PresuntoFrango;
import Questao2.Ingrediente.Salada.SemSalada;
import Questao2.Ingrediente.Salada.Salada;

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
