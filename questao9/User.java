package questao9;

import java.util.*;

public abstract class User {
    public void logar(String login, String senha){
        Scanner sc = new Scanner(System.in);
        login = sc.nextLine();
        senha = sc.nextLine();

        System.out.println("Você está logado");
        sc.close();
    };

    public void criarConta(){
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String senha = sc.nextLine();
        sc.close();

        System.out.println("Conta criada com sucesso");
    };

    public void deslogar(){
        System.out.println("Saindo...");
    }
}
