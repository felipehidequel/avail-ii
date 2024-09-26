package questao9;

import java.util.Scanner;

public class Adm extends User {
    public String login;
    public String senha;
    public int numeroCracha;

    public void criarConta(){
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String senha = sc.nextLine();
        int numeroCracha = this.numeroCracha;
        sc.close();

        System.out.println("Conta criada com sucesso");
    }    

}
