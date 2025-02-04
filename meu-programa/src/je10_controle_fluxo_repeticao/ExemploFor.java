package je10_controle_fluxo_repeticao;

public class ExemploFor {
    public static void main(String[] args) {
        // Exemplo 1
//        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
//            System.out.println(carneirinhos + " - Carneirinho(s)");
//        }

        // Exemplo 2
//        int carneirinhos = 0;
//        for (; carneirinhos <= 20 ;){
//            System.out.println(carneirinhos + " - Carneirinho(s)");
//            carneirinhos = carneirinhos + 2;
//        }

        //Exemplo 3
//        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};
//
//        for (int x = 0; x < alunos.length; x++){
//            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
//        }

        //Exemplo 4
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};
        for (String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
