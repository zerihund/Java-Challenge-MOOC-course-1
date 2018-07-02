
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int limit = Integer.parseInt(reader.nextLine());
        int num =1;
        while (num<=limit) {            
            System.out.println(num);
            num++;
        }
        
        // Write your code here
        
    }
}
