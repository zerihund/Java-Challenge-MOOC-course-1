import java.util.Arrays;

public class Main {
    public static int[] copy(int[] array) {
    
            int[] copyedArray = new int[array.length];
            for(int i=0;i<copyedArray.length;i++){
                copyedArray[i] = array[i];
            }
            return copyedArray;
    }
    
     public static int[] reverseCopy(int[] array){
        int [] reverseArray = new int[array.length];
        for(int i = array.length-1;i>=0;i--){
            reverseArray[array.length-1-i]=array[i];
        }
        return reverseArray;
     }
    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);
        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
        System.out.println( "copied: " + Arrays.toString(copied));
        
    }
    
}
