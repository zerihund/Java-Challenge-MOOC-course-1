import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i : array){
            if(i<smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = smallest(array);
        int buffer = 0;
        
        for(int i : array){
            
            if(i == smallest){
                break;
            }
            buffer++;
        }
      
        return buffer;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int indexSmallestStarting = index;
        for(int i = index; i < array.length; i++){
            if(array[indexSmallestStarting] > array[i]){
                indexSmallestStarting = i;
            }
        }
        return indexSmallestStarting;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
    
}
