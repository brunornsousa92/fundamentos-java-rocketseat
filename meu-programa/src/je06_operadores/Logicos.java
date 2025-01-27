package je06_operadores;

public class Logicos {
    public static void main(String[] args) {
//        boolean condicao1 = false;
//        boolean condicao2 = true;

        /*
        Aqui estamos utilizando o operador lógico E para fazer a uniçao das duas
        expressões.
        É como tivesse escrito:
        "Se condicao1 e condicao2 forem verdadeiras, exexutar o código"
         */

//        if (condicao1 && condicao2)
//            System.out.println("Os dois valores precisam ser verdadeiros");

        // Se condicao1 OU condicao2 for verdadeira, executar o código:

//        if (condicao1 || condicao2)
//            System.out.println("Um dos valores precisam ser verdadeiros");

//        if (1 == 1 && 2 < 3)
//            System.out.println("Os dois valores precisam ser verdadeiros");

//        if (( 1 == 1 && 2 > 3) || 4 < 5 )
//            System.out.println("Lógica complexa porém verdadeira");

        int numero1 = 1;
        int numero2 = 1;

        if ( numero1 == 2 || numero2 ++ == 2)
            System.out.println("As duas condições são verdadeiras");

        System.out.println("O número 1 agora é: " + numero1);
        System.out.println("O número 2 agora é: " + numero2);
    }
}
