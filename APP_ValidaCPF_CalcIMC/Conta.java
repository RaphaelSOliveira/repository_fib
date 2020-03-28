public class Conta
{
    //Atributo
    
    private double saldo = 0; 
    
    Person dono;   
    //Métodos
    
    //Método Depósito
    public double deposito(double valor)
    {
        //Adiciona parâmetro no Saldo
        return saldo += valor;  
    }
    
    public boolean saque(double valor)
    {
        //Remove parâmetro no Saldo
        if(valor <= saldo)
        {
            saldo -= valor;  
            return true;
        }
        else
        {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }
    
    public void donoConta(Person pessoa)
    {
        dono = pessoa;  
    }
    
    public double mostraSaldo()
    {   
        return  saldo;
    }
}
