public class Person
    {
       // Atributos
        String rg;
        String cpf;
        String name;
        String adress;
        String email;
           int age;
       boolean donor;
        double weight;
        double height;
       
       //Métodos
       
       // Método que valida o CPF.
        public static boolean validateCPF(String cpf) {
            
        // Remendo os pontos e o traço: "323.456.134-34"   ---->    "32345612334"
        cpf = cpf.replace(".","").replace("-","");
        
        // Testando CPFs inválidos
        if (cpf.equals("00000000000") ||
             cpf.equals("11111111111") ||
             cpf.equals("22222222222") ||
             cpf.equals("33333333333") ||
             cpf.equals("44444444444") ||
             cpf.equals("55555555555") ||
             cpf.equals("66666666666") ||
             cpf.equals("77777777777") ||
             cpf.equals("88888888888") ||
             cpf.equals("99999999999") ||
             (cpf.length() != 11)){
             return (false);
            }
         
         // Criando vetor de char letras na memória;   
         char [] letters = new char [cpf.length()];
         // separando o valor da String em um vetor de Char
         letters = cpf.toCharArray();
         
         // Criando vetor de int numberCpf na memória;
         int [] numberCpf = new int[ cpf.length()];
         
         int digt10, digt11; // Armazena o décimo e o décimo primeiro dígito.
        
         int peso, acumulador; // Peso é o multiplicador que vai diminuindo (lógica do cálculo de CPF)
         
         // Loop para percorrer o vetor
         for (int i=0;i<cpf.length();i++){
             // Função que que transforma Char em Int e armazena na memória
             // valueOf converts different types of values into string
             numberCpf[i] = Integer.parseInt(String.valueOf(letters[i]));
            }
         
         peso=10; //Inicializa o peso
         acumulador=0;
         
         //Soma a múltiplicação, com o respectivo peso, dos primeiro nove elementos do vetor.
         for(int i=0;i<9;i++){
             acumulador += numberCpf[i] * peso;
             peso = peso - 1;
            }
         
         //Calcula o primeiro dígito verificador
         digt10 = (acumulador * 10) % 11; 
         
         peso = 11; //Inicializa o peso
         acumulador = 0; //Reseta o acumulador
         
         //Soma a múltiplicação, com o respectivo peso, dos primeiro 10 elementos do vetor.
         for(int i=0;i<10;i++){
             acumulador += numberCpf[i] * peso;
             peso = peso - 1;
            }
         
         //Calcula o primeiro dígito verificador
         digt11 = (acumulador * 10) % 11;
         
         //Faz a verificação dos dígitos
         if(numberCpf[9] != digt10 || numberCpf[10] != digt11){
             return false;
            }
            
         //Retorna verdadeiro se válido   
         return true;
       }
       
       
       // Método que calcula o IMC.
       public static String calculaIMC(double weigth,double height){
           
           // Calculando IMC
           double imc = weigth / (height * height);
           String risk;
           
           
           // Classificando o risco
           if(imc < 18.5){
               risk = "Risco: Baixo(com risco de outras doenças)";
           }
           else if(imc >= 18.5 & imc <= 24.9){
               risk = "Risco: Normal";
           }
           else if(imc >= 25.0 & imc <= 29.9){
              risk = "Risco: Elevado";
           }
           else if(imc >= 30.0 & imc <= 34.9){
               risk = "Risco: Alto";
           }
           else if(imc >= 18.5 & imc <= 24.9){
               risk = "Risco: Muito Alto";
           }
           else{
               risk = "Risco: Iminente";
           }
           
           //Mostra o IMC
           System.out.println("O seu IMC é de: " + imc);
           
           //Retorna o risco
           return(risk);
        }
}



