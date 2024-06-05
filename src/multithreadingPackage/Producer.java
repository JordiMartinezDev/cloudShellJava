package multithreadingPackage;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    
    BlockingQueue<Integer> questionQueue;

    public Producer(BlockingQueue<Integer> questionQueue){
        this.questionQueue = questionQueue;

    }
    @Override
    public void run(){

    }
}
