import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    // Define the variables

    public PasswordRandomizer(int length) {
        random = new Random();
        this.length= length;
        // Initialize the variable
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass="";
        int i;
        for(i=0;i<this.length;i++){
            char alph = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            pass += alph;
        }
        return pass;
    }
}
