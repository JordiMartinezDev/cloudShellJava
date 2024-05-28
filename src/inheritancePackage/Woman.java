package inheritancePackage;

public class Woman extends Human implements Talkable {
    
    public Woman(int age,String name){
        super(age,name);
    }

    public void giveBirth(){
        System.out.println("I am giving birth to a baby");
    }
    public int talk(int hello){
        System.out.println("Hello Talking Worman " +hello);
        return hello+1;
    }

    
}
