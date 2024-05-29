package inheritancePackage;

import java.util.Scanner;

public class UserInput {
    
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter text:");
        String enteredText = input.nextLine();

        
        System.out.println(" You entered the text : \n"+enteredText);
    }

}
