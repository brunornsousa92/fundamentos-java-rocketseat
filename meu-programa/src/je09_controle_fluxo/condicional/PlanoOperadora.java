package je09_controle_fluxo.condicional;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano){
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default:{
                System.out.println("Plano indefinido");
            }
        }
    }
}
