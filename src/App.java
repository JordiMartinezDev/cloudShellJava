import inheritancePackage.Human;
import inheritancePackage.Man;
import inheritancePackage.Woman;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Woman amanda = new Woman(35, "Amanda");
        Man jordi = new Man(23,"Jordi");
        amanda.speak();
        amanda.giveBirth();
        jordi.speak();
        Human.staticMethod();
        
        int myvar = amanda.talk(23);
        System.out.println("Myvar: "+myvar);

        jordi.fuck();
        amanda.fuck();
        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println("---------------------------");

        peopleFucking(amanda);
        peopleFucking(jordi);
    }
    public static void peopleFucking(Human human){
            human.fuck();
    }
}
