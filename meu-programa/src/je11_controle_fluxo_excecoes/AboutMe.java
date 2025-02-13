package je11_controle_fluxo_excecoes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = "";
        String sobrenome = "";
        try {
            System.out.println("Digite seu nome");
            nome = scanner.nextLine().trim();
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode estar vazio.");
            }

            System.out.println("Digite seu sobrenome");
            sobrenome = scanner.nextLine().trim();
            if (sobrenome.isEmpty()){
                throw new IllegalArgumentException("O sobrenome não pode star vazio.");
            }

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }



        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
    }
}
