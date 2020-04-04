public class Salario
{
    //Atributo
    
    public   double salarioHora; 
    public   int  horas;
    public   int  numDependentes;
    public   double salarioBruto;
    public   double descInss;
    public   double descIr; 
    public   double salarioLiquido; 
           
           
    //Métodos
    
    //Método calcula salário bruto
    public double salarioBruto()
    {
       this.salarioBruto = this.horas * this.salarioHora + (50 * this.numDependentes);
       return this.salarioBruto;
    }
    
    //Método desconto INSS
    public double descontoINSS()
    {
       
       if (this.salarioBruto <= 1000)
       {
           this.descInss = this.salarioBruto * 8.5/100;
       }
       else
       {
           this.descInss = this.salarioBruto * 9/100;         
       }
       return this.descInss;
    }
    
    //Método desconto IR
    public double descontoIR()
    {
       double valor;
       
       if (this.salarioBruto <= 500)
       {
           this.descIr = 0;
       }
       else if(this.salarioBruto > 500 & this.salarioBruto <= 1000)
       {
           this.descIr = this.salarioBruto * 5/100;        
       }
       else
       {
           this.descIr = this.salarioBruto * 7/100;
       }
       return this.descIr;
    }
    
    // Salário Líquido
    public double salarioLiquido()
    {
       this.salarioLiquido = this.salarioBruto - this.descInss - this.descIr;
       return this.salarioLiquido;
    }
}
