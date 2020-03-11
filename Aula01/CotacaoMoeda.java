
/**
 * Write a description of class CotacaoMoeda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CotacaoMoeda
{
    public static void main(String[] args){
        double valorReais = 1000.00;
        double cotacaoDolar = 4.25;
        double valorDolar = valorReais * cotacaoDolar;
        
        if(valorDolar > 100 & valorDolar <= 1000){
            valorDolar = valorDolar * 0.95;
        }
        if(valorDolar > 1000){
            valorDolar = valorDolar * 0.90;
        }
        System.out.println("O valor é " + valorDolar);
    }
}
