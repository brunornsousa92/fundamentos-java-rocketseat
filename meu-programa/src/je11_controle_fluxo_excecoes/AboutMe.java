package je11_controle_fluxo_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = "";
        String sobrenome = "";
        int idade = 0;
        boolean idadeValida = false;
        double altura = 0;
        boolean alturaValida = false;

        while(nome.isEmpty() || sobrenome.isEmpty()){
            try {
                if (nome.isEmpty()){
                    System.out.println("Digite seu nome");
                    nome = scanner.nextLine().trim();
                    if (nome.isEmpty()) {
                        throw new IllegalArgumentException("Erro: O nome não pode estar vazio.");
                    }
                }
                if (sobrenome.isEmpty()){
                    System.out.println("Digite seu sobrenome");
                    sobrenome = scanner.nextLine().trim();
                    if (sobrenome.isEmpty()){
                        throw new IllegalArgumentException("Erro: O sobrenome não pode star vazio.");
                    }
                }
                while (!idadeValida){
                    try {
                        System.out.println("Digite sua idade:");
                        idade = scanner.nextInt();
                        if (idade < 0){
                            System.out.println("Erro: A idade não pode ser negativa. Tente novamente");
                            idadeValida = false;
                        }else {
                            idadeValida = true;
                        }
                    } catch (InputMismatchException e){
                        System.out.println("Erro: A idade deve ser um número inteiro. Tente novamente");
                        scanner.next();
                    }
                }
                while(!alturaValida){
                    try {
                        System.out.println("Digite sua altura (use ponto como separador decimal, ex: 1.75):");
                        altura = scanner.nextDouble();
                        alturaValida = true;
                    }catch (InputMismatchException e){
                        System.out.println("Erro: A altura deve ser um número decimal com ponto (.) como separador. Tente novamente.");
                        scanner.next();
                    }
                }
                // Imprimindo os dados obtidos pelo usuário
                System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + "cm ");
                scanner.close();
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
    }
    }
}
