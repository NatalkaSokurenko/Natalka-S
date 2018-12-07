package task1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Character> list = new ArrayList<Character>();
        String text = "xyyz";
        text.length();
        for(int i=0; i<text.length(); i++ ){
            char symbol= text.charAt(i);
            if (list.contains(symbol)){
                System.out.println("false");
                return;
            } else {
                list.add(symbol);
            }
        }
        System.out.println("true");



    }
}
