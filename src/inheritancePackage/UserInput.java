package inheritancePackage;

import java.util.Scanner;

public class UserInput {
    
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter text:");
        String enteredText = input.nextLine();
        System.out.println(" You entered the text : \n"+enteredText);

    }

    public static void testExceptions(int number) throws Exception{

        if(number > 10) System.out.println("Perfect, number is bigger than 10");
        else throw new Exception("Number must be bigger than 10, you entered "+number);
    }

}
