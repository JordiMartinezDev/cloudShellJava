import inheritancePackage.Human;
import inheritancePackage.Man;
import inheritancePackage.Woman;

public class App {
    public static void main(String[] args) throws Exception {

        String str = "ABCDEFG";
        String substring = str.substring(0,3);

        System.out.println(substring);

        if(substring.equals("ABC")) System.out.println("It is true, ABC");
                // System.out.println("Hello, World!");

        // Woman amanda = new Woman(35, "Amanda");
        // Man jordi = new Man(23,"Jordi");
        // amanda.speak();
        // amanda.giveBirth();
        // jordi.speak();
        // Human.staticMethod();
        
        // int myvar = amanda.talk(23);
        // System.out.println("Myvar: "+myvar);

        // jordi.fuck();
        // amanda.fuck();
        // System.out.println("---------------------------");
        // System.out.println("---------------------------");

        // System.out.println("---------------------------");

        // peopleFucking(amanda);
        // peopleFucking(jordi);
    

    for(int i=0; i< 100;i++){
        System.out.println("Number: "+ i);
    }
}
    // public static void peopleFucking(Human human){
    //         human.fuck();
    // }
}
