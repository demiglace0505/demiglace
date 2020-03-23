
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        System.out.println(sum(myList));
        
        myList.add(6);
        System.out.println(sum(myList));
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int value : numbers) {
            sum = value + sum;
        }
        
        return sum;
    }

}
