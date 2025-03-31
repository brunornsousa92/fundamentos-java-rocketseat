package je14_pilares_poo;

public class SistemaMensagemInstantanea {
    public void enviarMensagem(){
        if (validarConectadoInternet())
            System.out.println("Enviando mensagem");
        else
            System.out.println("Computador offline");
    }
    public void recebendoMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private boolean validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
        return true;
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
