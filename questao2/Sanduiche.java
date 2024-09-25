package questao2;

import questao2.Factory.SanduicheIngredientFactory;
import questao2.Ingrediente.Pao.Pao;
import questao2.Ingrediente.Presunto.Presunto;
import questao2.Ingrediente.Queijo.Queijo;
import questao2.Ingrediente.Salada.Salada;

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
