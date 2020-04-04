 class APP_Salario
{
   public static void main( String[] args ){
       //Criando objeto na memória  
       Salario joao = new Salario();
       
       double valorSalarioBruto;
       double valorDescInss;
       double valorDescIr;
       double valorSalarioLiquido;
       
       //Atrbuindo valores
       joao.salarioHora = 100;
       joao.horas = 160;
       joao.numDependentes = 3;
        
       valorSalarioBruto = joao.salarioBruto();
       System.out.println("O valor do salário bruto é de: " + valorSalarioBruto);
       
       valorDescInss = joao.descInss;
       System.out.println("O valor do desconto do INSS é de:" + valorDescInss);
       
       valorDescIr = joao.descontoIR();
       System.out.println("O valor do desconto do IR é de:" + valorDescIr);
       
       valorSalarioLiquido = joao.salarioLiquido;
       System.out.println("O valor do salário líquido é de:" + valorSalarioLiquido);
    }
}
