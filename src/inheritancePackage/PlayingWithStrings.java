package inheritancePackage;

public class PlayingWithStrings {
    public static void run(){
        String str = "ABCDEFG";
        String substring = str.substring(0,3);

        System.out.println(substring);

        if(substring.equals("ABC")) System.out.println("It is true, ABC");
    }
}
