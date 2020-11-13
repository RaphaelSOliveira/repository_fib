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
}
