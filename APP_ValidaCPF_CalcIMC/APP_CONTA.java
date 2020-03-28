public class APP_CONTA
{
   public static void main(String[] args)
   { 
       //Criando objeto c na memória
       Conta c = new Conta();
   
       //Utilizando métodos para gerar saldo na conta
       double saldoTotal = c.deposito(600);
       boolean sacou = c.saque(200);
       
       if(sacou==true) 
       {
           System.out.println("Saque efetuado");
       }
       else
       {
           System.out.println("Saldo Insuficiente");
       }
       
       //Mostrando o Saldo
       System.out.println("saldo total: " + saldoTotal);
   }
}
