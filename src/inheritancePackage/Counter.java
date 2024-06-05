package inheritancePackage;

public  class Counter {
    public static int count = 0;

    public  int getNext(){
        synchronized(this){
            count++;
            return count;
        }
        
    }
}
