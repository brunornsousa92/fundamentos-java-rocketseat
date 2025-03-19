package je13_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
//        System.out.println("Bruno");
//        System.out.println("Roberto");
//
//        try{
//            System.out.println("Dividindo 1/0");
//            System.out.println(1/0);
//        }catch (Exception ex){
//            System.err.println("Houve um erro na tentativa de divisão");
//
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite seu nome: ");
//        String nome = scan.next();
//
//        System.out.println("Digite sua idade: ");
//        Integer idade = scan.nextInt();
//
//        System.out.println("Seu nome é: " + nome);
//        System.out.println("Sua idade é: " + idade);

//        String nome = null;
//        Integer idade = null;
//        Double altura = null;
//
//        // Simulando uma linha em um arquivo txt
//        String stringLinhaArquivo = "bruno roberto|32|85.05";
//        Scanner scan = new Scanner(stringLinhaArquivo);
//        scan.useDelimiter("\\|"); // Definindo um delimitador
//        // Conhecendo novos recursos
//        int index = 0;
//        while (scan.hasNext()){ // Olha um conceito de controle de repetição sendo aplicado, tudo está mais claro agora hein??
//            if (index == 0) // Uuufa, sorte que eu aprendi sobre controle de fluxo e operadores anteriormente
//                nome = scan.next();
//                else if (index == 1)
//                    idade = Integer.valueOf(scan.next());
//                else
//                    altura = Double.valueOf(scan.next());
//                index ++;
//        }
//        System.out.println("Seu nome é: " + nome);
//        System.out.println("Sua idade é: " + idade);
//        System.out.println("Seu peso é: " + altura);

        // scan.nextBigDecimal(); scan.nextBoolean(); -> Já sacou o conceito, correto?

//        String nome = "Bruno";
//        int idade = 32;
//        double altura = 1.70;
//        double renda = 2600.59;

        // Vamos imprimir os dados acima aplicando uma formatação no console

        //System.out.println(formato, array de parâmteros (,,,,));

//        System.out.printf("Nome: %s Idade: %d Altura: %.2f Renda: R$ %,.2f", nome, idade, altura, renda);

        // Resultado ao console: Nome: Bruno Idade: 32 Altura: 1.70 Renda: R$ 2600,59

        //%s ->     parâmetros do tipo String
        //%d ->     parâmetros do tipo Integer / Long
        //%f ->     parâmetros do tipo Double / Float
        //.2 ->     quer dizer que serão dois dígitos decimais
        //,.2 ->    quer dizer que serão dois dígitos decimais e informando o (.) de milhar

        String nome = "Bruno";
        nome = nome.concat(" Sousa");
        nome = nome.concat(" sou Desenvolvedor");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append("Bruno");
        sb.append(" Sousa");
        sb.append(" sou Desenvolvedor");

        System.out.println(sb);





    }
}
