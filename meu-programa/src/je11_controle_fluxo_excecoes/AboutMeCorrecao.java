package je11_controle_fluxo_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeCorrecao {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = 0;
        try {
            altura = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.err.println("A altura deve ser digitada no padrão americano 0.00");
        }

        // Imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
    }
}
