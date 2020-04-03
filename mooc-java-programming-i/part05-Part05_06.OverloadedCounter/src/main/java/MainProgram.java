
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter myZeroCounter = new Counter();
        Counter myNotZeroCounter = new Counter(5);
        
        System.out.println("myZeroCounter " + myZeroCounter);
        System.out.println("myNotZeroCounter " + myNotZeroCounter);
        
        myZeroCounter.increase();
        myNotZeroCounter.decrease();
                
        System.out.println("myZeroCounter " + myZeroCounter);
        System.out.println("myNotZeroCounter " + myNotZeroCounter);
                
        myZeroCounter.increase(2);
        myNotZeroCounter.decrease(2);
                
        System.out.println("myZeroCounter " + myZeroCounter);
        System.out.println("myNotZeroCounter " + myNotZeroCounter);
    }
}
