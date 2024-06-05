package inheritancePackage;
import inheritancePackage.Counter;


public class ThreatPractice extends Thread{
    public Counter counter;
    public ThreatPractice(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        System.out.println("Starting thread..");
        for(int i = 0; i < 10; i++){
        System.out.println("Thead: "+ Thread.currentThread().getName() +" Counting - "+ counter.getNext());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }

}
