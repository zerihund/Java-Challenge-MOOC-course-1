
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name;
        String studentNumber;
        
        while (true){
            System.out.println("name: ");
            name = reader.nextLine();
            
            if(name.isEmpty())
                break;
            
            System.out.println("studentnumber: ");
            studentNumber = reader.nextLine();
            
            Student info = new Student(name, studentNumber);
            
            list.add(info);
        }
        
        for (Student info : list){
            System.out.println(info.toString());
        }
        
        System.out.print("search term:");
        String search = reader.nextLine();
        
        System.out.println("Result: ");
        for(Student j:list){
            if(j.getName().contains(search)){
                System.out.println(j);
            }
        }
    }
}