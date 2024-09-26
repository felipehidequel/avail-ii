package questao2.Factory;

import questao2.Ingrediente.Pao.Pao;
import questao2.Ingrediente.Pao.PaoFrances;
import questao2.Ingrediente.Presunto.Presunto;
import questao2.Ingrediente.Presunto.PresuntoFrango;
import questao2.Ingrediente.Queijo.Queijo;
import questao2.Ingrediente.Queijo.QueijoMussarela;
import questao2.Ingrediente.Salada.ComSalada;
import questao2.Ingrediente.Salada.Salada;

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
