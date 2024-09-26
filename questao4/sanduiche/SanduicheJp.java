package questao4.sanduiche;

public class SanduicheJp implements Sanduiche{
    @Override
    public void montar(){
        System.out.println("Pão francês, queijo mussarela, presunto de frango, com verdura.");
    }

    @Override
    public String toString() {
        return "Pão francês, queijo mussarela, presunto de frango, com verdura.";
    }
}
