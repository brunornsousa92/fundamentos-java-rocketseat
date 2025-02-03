package je09_controle_fluxo.condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
//        int nota = 6;
//
//        if (nota >= 7){
//            System.out.println("Aprovado!");
//        } else if (nota >= 5 && nota < 7) {
//            fluxoIntermediario();
//        } else{
//            System.out.println("Reprovado!");
//        }

//        static void fluxoIntermediario(){
//            // Faria alguma coisa
//            System.out.println("Recuperação!");
//            System.out.println("Estude um pouco mais");
//        }

        // Atribuição Ternária
        // Cenário 1

//        int nota = 7;
//        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
//        System.out.println(resultado);

        // Cenario 2

        int nota = 8;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);


    }
}
