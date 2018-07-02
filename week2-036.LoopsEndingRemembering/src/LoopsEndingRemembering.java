import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers");
        int sum = 0;
        int count=0;
        double avarage=0;
        int counte = 0;
        int counto =0;
        while(true){
            int num = Integer.parseInt(reader.nextLine());
            if(num ==-1){
               break;
            }
            else{
            
                System.out.println(num);
                sum = sum + num;  
                count++;
                if(num%2==0){
                    counte++;
                }
                else{
                    counto++;
                }
           }
        }
        avarage = (double)sum/count;
       System.out.println("Thank you and see you later!");
       System.out.println("The sum is "+ sum);
       System.out.println("How many numbers: "+count);
       System.out.println("Average:"+avarage);
       System.out.println("Even numbers:"+counte);
       System.out.println("Odd numbers:" + counto);
               
    }
}
