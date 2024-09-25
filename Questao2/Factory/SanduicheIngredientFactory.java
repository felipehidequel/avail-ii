package Questao2.Factory;

import Questao2.Ingrediente.Pao.Pao;
import Questao2.Ingrediente.Queijo.Queijo;
import Questao2.Ingrediente.Presunto.Presunto;
import Questao2.Ingrediente.Salada.Salada;

public interface SanduicheIngredientFactory {
    Pao criarPao();

    Queijo criarQueijo();
    
    Presunto criarPresunto();

    Salada criarSalada();
}
