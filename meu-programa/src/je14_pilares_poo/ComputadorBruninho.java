package je14_pilares_poo;

public class ComputadorBruninho {
    public static void main(String[] args) {
//        MSNMessenger msnMessenger = new MSNMessenger();
//        msnMessenger.enviarMensagem();
//        msnMessenger.recebendoMensagem();
//        msnMessenger.validarConectadoInternet();
//        msnMessenger.salvarHistoricoMensagem();
//        FacebookMessenger facebookMessenger = new FacebookMessenger();
//        facebookMessenger.enviarMensagem();
//        facebookMessenger.recebendoMensagem();
//        Telegram telegram = new Telegram();
//        telegram.enviarMensagem();
//        telegram.recebendoMensagem();
        SistemaMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.recebendoMensagem();
    }
}
