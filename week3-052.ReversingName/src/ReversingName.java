§import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type yoour name: ");
        String name =reader.nextLine();
        
        int j= name.length()-1;
        String namer ="";
        while(0<=j){
            namer += name.charAt(j);
            j--;
        } 
        System.out.println("In reverse order:"+ namer);
    }
}
