import java.util.ArrayList;
import java.util.List;
    
public class Urna
{
    // variáveis
    List<Voto> votos = new ArrayList<Voto>();
        
    public void registraVoto(Voto voto){
           votos.add(voto);
    }
    
    public int totalVotos(){
        return votos.size();
    }
    
    public int votosCandidato(Candidato candidato){
        int tot = 0;
        for(int i=0;i<votos.size();i++){
            if(votos.get(i).candidato == candidato){
                tot++;
            }
        }
        return tot;
    }
}
