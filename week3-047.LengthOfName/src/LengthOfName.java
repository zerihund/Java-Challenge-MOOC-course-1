
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        System.out.println("Type your name :");
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of characters:  " + calculateCharacters(reader.nextLine()));
        // call your method from here
    }
    
    // do here the method
     public static int calculateCharacters(String text){
         return text.length();
     
     }
    
}
