package questao2.Factory;

import questao2.Ingrediente.Pao.Pao;
import questao2.Ingrediente.Pao.PaoBola;
import questao2.Ingrediente.Presunto.Presunto;
import questao2.Ingrediente.Presunto.PresuntoPeru;
import questao2.Ingrediente.Queijo.Queijo;
import questao2.Ingrediente.Queijo.QueijoCheddar;
import questao2.Ingrediente.Salada.Salada;
import questao2.Ingrediente.Salada.SemSalada;

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
