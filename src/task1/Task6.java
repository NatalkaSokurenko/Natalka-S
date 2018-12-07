package task1;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        String text = "the quick red cat jumps over the lazy mouse";
        for(int i=0; i<text.length(); i++ ){
            char symbol = text.charAt(i);
            String result = symbol + "";
            if (i==0) {
                result = result.toUpperCase();
            }else{
                char prev = text.charAt(i-1);
                if(prev==' '){
                    result = result.toUpperCase();
                }
            }
            System.out.print(result);

        }
    }
}
