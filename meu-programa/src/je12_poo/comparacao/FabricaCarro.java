package je12_poo.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "uno");
        Carro carro3 = new Carro("branca", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");
        Carro carro5 = new Carro("branca", "fiat", "palio");

        Carro carro6 = carro1;

        // Case 01
        System.out.println(carro1 == carro6); // False

        // Case 02
        System.out.println(carro1.equals(carro2)); // ???
        System.out.println(carro1.equals(carro3));

    }
}
