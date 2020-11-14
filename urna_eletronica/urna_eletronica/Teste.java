public class Teste
{
    // variáveis
    public static void main(String[] args){
        // Urna
        Urna urna1 = new Urna();
        
        // Eleitores
        Eleitor eleitor1 = new Eleitor();
        eleitor1.setAtributos("001", "Escola", "Maria", "234.234.654.2", "29/03/1987");
        
        Eleitor eleitor2 = new Eleitor();
        eleitor2.setAtributos("002", "Ginásio", "João", "198.234.654.2", "07/07/1998");
        
        Eleitor eleitor3 = new Eleitor();
        eleitor3.setAtributos("003", "Colégio", "Americo", "198.234.654.2", "07/07/1978");
        
        // Candidatos a Presidência
        Candidato candidato1 = new Candidato("Presidente", "ABC", 12);
        candidato1.setAtributos("004", "Faculdade", "Giovana", "163.234.654.2", "07/10/1993");
        
        Candidato candidato2 = new Candidato("Presidente", "BBB", 14);
        candidato2.setAtributos("005", "Igreja", "Luis", "123.456.654.2", "01/02/1983");
        
        // Candidatos a Senador
        Candidato candidato3 = new Candidato("Senador", "ABC", 1212);
        candidato3.setAtributos("006", "Faculdade", "Alberto", "356.234.654.2", "17/11/1998");
        
        Candidato candidato4 = new Candidato("Senador", "BBB", 1414);
        candidato4.setAtributos("007", "Escola", "Carla", "284.456.654.2", "01/12/1969");
        
        // Candidatos a Deputado
        Candidato candidato5 = new Candidato("Senador", "ABC", 12121);
        candidato5.setAtributos("008", "Igreja", "Adalberto", "356.999.654.2", "12/98/2001");
        
        Candidato candidato6 = new Candidato("Senador", "BBB", 14141);
        candidato6.setAtributos("009", "Ginásio", "Carla", "999.356.654.2", "01/01/1979");
        
        // Votos eleitor1
        //Presidente
        Voto voto1 = new Voto();
        voto1.setVoto(eleitor1, candidato1);
        //Senador
        Voto voto2 = new Voto();
        voto2.setVoto(eleitor1, candidato4);
        //Deputado
        Voto voto3 = new Voto();
        voto3.setVoto(eleitor1, candidato5);
        //Registra Votos
        urna1.registraVoto(voto1);
        urna1.registraVoto(voto2);
        urna1.registraVoto(voto3);
        //----------------------------
        
        // Votos eleitor2
        //Presidente
        Voto voto4 = new Voto();
        voto4.setVoto(eleitor2, candidato1);
        //Senador
        Voto voto5 = new Voto();
        voto5.setVoto(eleitor2, candidato3);
        //Deputado
        Voto voto6 = new Voto();
        voto6.setVoto(eleitor2, candidato6);
        //Registra Votos
        urna1.registraVoto(voto4);
        urna1.registraVoto(voto5);
        urna1.registraVoto(voto6);
        
        //----------------------------
        
        // Votos eleitor3
        //Presidente
        Voto voto7 = new Voto();
        voto7.setVoto(eleitor3, candidato2);
        //Senador
        Voto voto8 = new Voto();
        voto8.setVoto(eleitor3, candidato3);
        //Deputado
        Voto voto9 = new Voto();
        voto9.setVoto(eleitor3, candidato6);
        //Registra Votos
        urna1.registraVoto(voto7);
        urna1.registraVoto(voto8);
        urna1.registraVoto(voto9);
        //----------------------------
        
        // Votos do candidato1
        //Presidente
        Voto voto10 = new Voto();
        voto10.setVoto(candidato1, candidato1);
        //Senador
        Voto voto11 = new Voto();
        voto11.setVoto(candidato1, candidato3);
        //Deputado
        Voto voto12 = new Voto();
        voto12.setVoto(candidato1, candidato5);
        //Registra Votos
        urna1.registraVoto(voto10);
        urna1.registraVoto(voto11);
        urna1.registraVoto(voto12);
        //----------------------------
        
        // Votos do candidato2
        //Presidente
        Voto voto13 = new Voto();
        voto13.setVoto(candidato2, candidato2);
        //Senador
        Voto voto14 = new Voto();
        voto14.setVoto(candidato2, candidato4);
        //Deputado
        Voto voto15 = new Voto();
        voto15.setVoto(candidato2, candidato6);
        //Registra Votos
        urna1.registraVoto(voto13);
        urna1.registraVoto(voto14);
        urna1.registraVoto(voto15);
        //----------------------------
        
        // Mostra o total de votos
        System.out.println(urna1.totalVotos());
        
        // Mostra o total de votos por candidato        
        System.out.println(urna1.votosCandidato(candidato1));
    }
}
