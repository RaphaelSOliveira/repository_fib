
/**
 *Raphael Serra de Oliveira
 *Dados os valores do Ácool e da Gasolina, descubra qual é o melhor sabendo que a gasolina é
 *70% mais performática.
 */
public class CalculoCombustivel
{
    
    public static void main(String[] args) {
            double valor_gasolina = 3.50;
            double valor_alcool = 2.70;
            double rendimento_gasolina = valor_gasolina * 0.7;
            
            if (rendimento_gasolina < valor_alcool){
                System.out.println("A gasolina está rendendo mais.");
            }
            else{
                System.out.println("O alcool está rendendo mais.");
            }
        }
}
