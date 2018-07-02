import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = Integer.parseInt(reader.nextLine());
        int num2 = Integer.parseInt(reader.nextLine());
        if(num1>num2){
            System.out.println("Greater number:"+num1);
        }
        else if(num2>num1){
            System.out.println("Greater number:"+num2);
        }
        else{
            System.out.println("The numbers are equal!");
        }

    }
}
