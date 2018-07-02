
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String email = reader.nextLine();
        String pass = reader.nextLine();
        if(email.equals("alex") && pass.equals("mightyducks")|| email.equals("emily")&& pass.equals("cat")){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
