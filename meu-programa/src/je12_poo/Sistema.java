package je12_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Sampaio");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        System.out.println(gleyson.limiteCredito);

        gleyson.comprar(50.0);

        Cliente izabelly = new Cliente("Izabelly Sampaio");
        System.out.println(izabelly.limiteCredito);
        izabelly.solicitarLimiteCredito(80.0);
        System.out.println(izabelly.limiteCredito);
        izabelly.comprar(22.0);

        System.out.println("Limite do(a) " + izabelly.nome + " é " + izabelly.limiteCredito);
        System.out.println("Limite do(a) " + gleyson.nome + " é " + gleyson.limiteCredito);

    }
}
