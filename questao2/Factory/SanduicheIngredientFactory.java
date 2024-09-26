package questao2.Factory;

import questao2.Ingrediente.Pao.Pao;
import questao2.Ingrediente.Presunto.Presunto;
import questao2.Ingrediente.Queijo.Queijo;
import questao2.Ingrediente.Salada.Salada;

public interface SanduicheIngredientFactory {
    Pao criarPao();

    Queijo criarQueijo();
    
    Presunto criarPresunto();

    Salada criarSalada();
}
