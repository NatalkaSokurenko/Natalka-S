package task1;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int[] number = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        List<Integer> first = new ArrayList<Integer>();
        List<Integer> second = new ArrayList<Integer>();

        for (int i = 0; i < number.length; i++) {
            if (!first.contains(number[i])) {
                first.add(number[i]);
            } else {
                second.add(number[i]);
            }
        }
        for (int i = 0; i < first.size(); i++) {
            int num = first.get(i);
            if (!second.contains(num)) {
                System.out.println(num);
            }
        }

    }
}
