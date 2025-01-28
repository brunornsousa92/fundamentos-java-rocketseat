package je07_documentacao;
/**
 * Calculadora Simples
 * @author Gleyson Sampaio
 * @since v1.0
 */

public class Calculadora {

    /**
     * Realiza a divisão entre dois números inteiros
     *
     * @param dividendo     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo
     * @return              O resultado da divisão entre o dividendo e o divisor
     * @author              Gleyson Sampaio
     * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     */

    Integer dividir(Integer dividendo, Integer divisor){
        return dividendo / divisor;
    }
}