public class APP_Person
{
    public static void main( String[] args ){
    
    //Criando objeto na memória  
    Person joao = new Person();
    //Atrbuindo valores
    joao.cpf = "529.982.247-25";//"44658858819";///"52998224725";
    joao.height = 1.80;
    joao.weight = 90;
    
    // Variáveis para armazenar o retorno
    boolean validaJoao;
    String  imcJoao;
    
    //Chamando método que valida o CPF e mostrando retorno
    validaJoao = joao.validateCPF(joao.cpf);
    System.out.println(validaJoao);
    
    //Chamando método que valida CPF e mostrando retorno
    imcJoao = joao.calculaIMC(joao.weight,joao.height);
    System.out.println(imcJoao);    
    }
}
