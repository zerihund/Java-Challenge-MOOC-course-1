
public class NumberStatistics {
    private int amountOfNumbers;
    private int number;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers=0;
    }

    public void addNumber(int number) {
        // code here
        this.number =this.number+number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
     public int sum() {
        // code here
        return number;
    }

    public double average() {
        // code here
        if(this.amountOfNumbers==0){
            return 0;
        }
        else{
            return (double)sum()/amountOfNumbers();
        }
    }

}
