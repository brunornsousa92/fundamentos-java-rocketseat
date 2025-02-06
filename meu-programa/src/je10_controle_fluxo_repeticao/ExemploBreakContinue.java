package je10_controle_fluxo_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
//        for (int numero = 1; numero <= 5; numero++){
//            if (numero == 3){
//                break;
//            }
//            System.out.println(numero);
//        }
        // Qual saída no console?

        for (int numero = 1; numero <= 5; numero++){
            System.out.println(numero);
            if (numero == 3){
                continue;
            }
            System.out.println("Execução após a regra");
        }
        // Qual saída no console?
    }
}
