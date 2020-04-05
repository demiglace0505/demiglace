
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack myStack = new Stack();

        System.out.println(myStack.isEmpty());//true
        System.out.println(myStack.values());// 

        myStack.add("ichika");
        System.out.println(myStack.isEmpty());//false
        System.out.println(myStack.values());//ichika

        myStack.add("nino");
        myStack.add("miku");
        System.out.println(myStack.values());//ichika nino miku
        
        String takenFromStack = myStack.take();
        
        myStack.add("yotsuba");
        myStack.add("itsuki");
        
        System.out.println(takenFromStack);//miku
        System.out.println(myStack.isEmpty());//false
        System.out.println(myStack.values());//ichika nino yotsuba itsuki

    }
}
