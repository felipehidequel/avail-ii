package Questao2;

import Questao2.Factory.SanduicheIngredientFactory;
import Questao2.Ingrediente.Pao.Pao;
import Questao2.Ingrediente.Presunto.Presunto;
import Questao2.Ingrediente.Queijo.Queijo;
import Questao2.Ingrediente.Salada.Salada;

public class Sanduiche {
    private Pao pao;
    private Presunto presunto;
    private Queijo queijo;
    private Salada salada;

    public Sanduiche(SanduicheIngredientFactory factory){
        this.pao = factory.criarPao();
        this.presunto = factory.criarPresunto();
        this.queijo = factory.criarQueijo();
        this.salada = factory.criarSalada();
    }

    @Override
    public String toString() {
        return "Sanduiche [pao=" + pao + ", presunto=" + presunto + ", queijo=" + queijo + ", salada=" + salada + "]";
    }

    
}
