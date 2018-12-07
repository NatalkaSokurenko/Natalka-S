package task1;

public class Task4 {
    public static void main(String[] args) {
        String[] array = {"cat", "flag", "green", "country", "w3resource"};
        String longestW = array[0];
        for(int i = 1; i < array.length; i++ ){
           if (array[i].length()>longestW.length()) {
               longestW = array[i];
           }
        }
        System.out.println(longestW);


    }
}
