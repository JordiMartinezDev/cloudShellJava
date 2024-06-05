import inheritancePackage.ArrayListLinkedList;
import inheritancePackage.Human;
import inheritancePackage.InheritanceAndAbstract;
import inheritancePackage.Loops;
import inheritancePackage.Man;
import inheritancePackage.PlayingWithStrings;
import inheritancePackage.TestingThreads;
import inheritancePackage.UserInput;
import inheritancePackage.Woman;
import inheritancePackage.ThreatPractice;


public class App {
    public static void main(String[] args) throws Exception {


            // Loops.run();
            // InheritanceAndAbstract.run();
            // PlayingWithStrings.run();

            // UserInput.run();
        //     try{
        //     UserInput.testExceptions(5);
        // }catch (Exception e){
        //     e.printStackTrace();
        // }
        // ArrayListLinkedList.run();

            TestingThreads aTrhead = new TestingThreads();
            TestingThreads aTrhead2 = new TestingThreads();

            // aTrhead.start();
            // aTrhead2.start();
            ThreatPractice practiceThread = new ThreatPractice();
            practiceThread.start();
    }
}
