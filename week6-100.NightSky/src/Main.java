
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.printLine();
        
        NightSky NightSky1 = new NightSky(8, 4);
        NightSky1.print();
        
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

    }
}
