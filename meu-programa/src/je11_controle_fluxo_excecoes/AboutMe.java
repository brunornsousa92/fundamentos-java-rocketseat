package je11_controle_fluxo_excecoes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode estar vazio.");
            }

            System.out.println("Nome digitado: " + nome);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }


        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
    }
}
