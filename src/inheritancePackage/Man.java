package inheritancePackage;

public class Man extends Human{
    
    public Man(int age, String name){
        super(age,name);
    }

    public void fuck(){
        System.out.println("Man fucks with dick");
    }

}
