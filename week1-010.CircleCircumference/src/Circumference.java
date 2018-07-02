
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.print("Type the radius:");
        int r = Integer.parseInt(reader.nextLine());
        double c = (double)(2*r* Math.PI);
        System.out.println("Circumferance of the circle: " + c);
    }
}
