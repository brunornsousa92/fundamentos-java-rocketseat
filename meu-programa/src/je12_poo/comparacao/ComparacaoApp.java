package je12_poo.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        //stack vs heap
//        Integer i1 = 128;
//        Integer i2 = Integer.parseInt("128");
//
//        System.out.println(i1.equals(i2));

        String string = "bruno";
        String string1 = new String("Bruno");

        System.out.println(string1.equalsIgnoreCase(string));
    }
}
