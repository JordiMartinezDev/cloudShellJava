import inheritancePackage.Human;
import inheritancePackage.Woman;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Human tom = new Human(23,"Tom");
        Woman amanda = new Woman(35, "Amanda");
        tom.speak();
        tom.speak();
        amanda.speak();
        amanda.giveBirth();
    }
}
