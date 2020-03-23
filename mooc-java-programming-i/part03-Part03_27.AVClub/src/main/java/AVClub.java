
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true){
            String sentence = scanner.nextLine();
            if ( sentence.equals("") ){
                break;
            }
            
            String[] words = sentence.split(" ");
            
            for (String piece : words) {
                if (piece.contains("av")){
                    System.out.println(piece);
                }
            }
            
        }


    }
}
