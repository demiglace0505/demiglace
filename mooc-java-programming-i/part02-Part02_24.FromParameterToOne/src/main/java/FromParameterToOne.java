

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int number){
        
        for (int i = number; i >= 1; i = i-1){
            System.out.println(i);
        }
    }

}
