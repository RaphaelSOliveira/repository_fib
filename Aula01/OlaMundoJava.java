
/**
 * Escreva a descrição da classe OlaMundoJava aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class OlaMundoJava
{
    public static void main(String[] args){
        //float  valorSalario = 1000.00f;
        double  valorSalario = 1000.00;
        int    numeroDependentes = 5;
        String nomeCidade = "Bauru";
        char   letra = 'B';
        boolean temSaldo = true;
        
        double valor1 = 10.20;
        double valor2 = 30.20;
        double soma = valor1 + valor2;
        
        if(soma>100){
            System.out.println("A soma do " + valor1 + " mais " + valor2 + " é maior que 100");
        }
        else{
            System.out.println("A soma do " + valor1 + " mais " + valor2 + " é menor que 100");
        }   
    
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}

