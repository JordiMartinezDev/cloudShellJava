package inheritancePackage;

public class TestingThreads extends Thread{
    
    public void run(){

        for(int i=0; i<50; i++){
            System.out.println("Number: "+i);
        }
    }
}
