package Questao2.Factory;

import Questao2.Ingrediente.Pao.Pao;
import Questao2.Ingrediente.Pao.PaoFrances;
import Questao2.Ingrediente.Queijo.Queijo;
import Questao2.Ingrediente.Queijo.QueijoMussarela;
import Questao2.Ingrediente.Presunto.Presunto;
import Questao2.Ingrediente.Presunto.PresuntoFrango;
import Questao2.Ingrediente.Salada.ComSalada;
import Questao2.Ingrediente.Salada.Salada;

public class SanduicheFactoryJp implements SanduicheIngredientFactory {
    public Pao criarPao() {
        return new PaoFrances();
    }

    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    public Salada criarSalada() {
        return new ComSalada();
    }
    
}
