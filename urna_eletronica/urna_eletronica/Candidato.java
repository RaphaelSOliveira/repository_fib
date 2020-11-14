public class Candidato extends Eleitor implements Candidatura
{
    // variáveis 
    String cargo;
    String partido;
    int numero;
    
    public Candidato(String cargo, String partido, int numero){
        this.cargo = cargo;
        this.partido = partido;
        this.numero = numero;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setPartido(String partido){
        this.partido = partido;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
