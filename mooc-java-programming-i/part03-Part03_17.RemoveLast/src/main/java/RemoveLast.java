
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> myList = new ArrayList<>();

        myList.add("ichika");
        myList.add("nino");
        myList.add("miku");
        myList.add("yotsuba");
        myList.add("itsuki");
        System.out.println(myList);
        removeLast(myList);
        removeLast(myList);
        System.out.println(myList);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() != 0) {
            strings.remove(strings.size() - 1);
        }

    }

}
