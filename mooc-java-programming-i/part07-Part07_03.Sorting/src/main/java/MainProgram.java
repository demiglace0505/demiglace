
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //             0  1  2  3   4   5
        int[] array = {3, 1, 5, 99, 3, 12};
        //part 1
        System.out.println("Smallest: " + smallest(array));//1
        //part 2
        System.out.println("Index of smallest: " + indexOfSmallest(array));//1
        //part 3
        System.out.println(indexOfSmallestFrom(array, 0));//1
        System.out.println(indexOfSmallestFrom(array, 1));//1
        System.out.println(indexOfSmallestFrom(array, 2));//4
        System.out.println(indexOfSmallestFrom(array, 3));//4
        //part 4
        swap(array, 2, 3);
        System.out.println(Arrays.toString(array)); // 3 1 99 5 3 12
        //part 5
        System.out.println("");
        sort(array);
    }

    public static int smallest(int[] intArray) {
        int smallestInt = intArray[0];
        for (int currentInt : intArray) {
            if (smallestInt > currentInt) {
                smallestInt = currentInt;
            }
        }
        return smallestInt;
    }

    public static int indexOfSmallest(int[] intArray) {
        int smallestInt = intArray[0];
        int smallestIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (smallestInt > intArray[i]) {
                smallestInt = intArray[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] intArray, int startIndex) {
        int smallestInt = intArray[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < intArray.length; i++) {
            if (smallestInt > intArray[i]) {
                smallestInt = intArray[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap (int[] intArray, int first, int second) {
        int indexSwapper = intArray[first];
        intArray[first] = intArray[second];
        intArray[second] = indexSwapper;
    }
    
    public static void sort (int[] intArray){
        int indexHolder = 0;
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length ; i++) {
            indexHolder = indexOfSmallestFrom(intArray,i);
            swap(intArray, i, indexHolder);
            System.out.println(Arrays.toString(intArray));
        }
    }

}
