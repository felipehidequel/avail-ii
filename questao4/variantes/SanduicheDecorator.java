package questao4.variantes;
import questao4.sanduiche.Sanduiche;

public abstract class SanduicheDecorator implements Sanduiche {
    protected Sanduiche sanduiche;

    public SanduicheDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public void montar() {
        sanduiche.montar();
    }

    @Override
    public String toString() {
        return sanduiche.toString();
    }
}
