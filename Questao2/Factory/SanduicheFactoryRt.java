package Questao2.Factory;

import Questao2.Ingrediente.Pao.Pao;
import Questao2.Ingrediente.Pao.PaoBola;
import Questao2.Ingrediente.Queijo.Queijo;
import Questao2.Ingrediente.Queijo.QueijoCheddar;
import Questao2.Ingrediente.Presunto.Presunto;
import Questao2.Ingrediente.Presunto.PresuntoPeru;
import Questao2.Ingrediente.Salada.SemSalada;
import Questao2.Ingrediente.Salada.Salada;

public class SanduicheFactoryRt implements SanduicheIngredientFactory {
    public Pao criarPao() {
        return new PaoBola();
    }

    public Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    public Salada criarSalada() {
        return new SemSalada();
    }
    
}
