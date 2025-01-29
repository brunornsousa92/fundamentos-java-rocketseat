package je09_controle_fluxo.condicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 16.00;
        double valorSolicitado = 17.00;

        if(valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        }else
            System.out.println("Saldo insuficiente!");

        System.out.println(saldo);
    }
}