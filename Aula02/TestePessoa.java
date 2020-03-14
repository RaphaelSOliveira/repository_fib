public class TestePessoa
{
    public static void main(String[] args){
        int x = 10;
        Person p1 = new Person();  
        
        p1.name = "Raphael";
        p1.donor = true;
        p1.adress = "Bauru";
        p1.age= 27;
        //p.cpf = "412412421";
        
        Person p2 = new Person();  
        p2.name = "Rafael";
        p2.age = 37;
        //System.out.println(x);
        
        p1 = p2;
        
        System.out.println(p1.name + ":" + p1.age);
        
        System.out.println(p2.name + ":" + p2.age);        
        //System.out.println(p.age); //default 0
        //System.out.println(p.cpf); //default null
    }
}
