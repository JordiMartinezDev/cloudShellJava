package inheritancePackage;

public class Woman extends Human{
    
    public Woman(int age,String name){
        super(age,name);
    }

    public void giveBirth(){
        System.out.println("I am giving birth to a baby");
    }
}
