package questao4.sanduiche;

public class SanduicheRt implements Sanduiche {
    @Override
    public void montar(){
        System.out.println("Pão bola, queijo cheddar, presunto de peru, sem verdura.");
    }

    @Override
    public String toString() {
        return "Pão bola, queijo cheddar, presunto de peru, sem verdura.";
    }
}
