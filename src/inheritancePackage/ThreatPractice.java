package inheritancePackage;

public class ThreatPractice extends Thread{
    

    @Override
    public void run(){
        System.out.println("Starting thread..");
        for(int i = 0; i < 10; i++){
        System.out.println("Counting - "+ i);

        }
    }

}
