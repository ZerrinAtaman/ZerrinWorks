package day10_practice_tasks;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2',
                'c', 'd', '@', '!', '3', '4'));

        for (int i = 0; i < list.size(); i++) {
            char character = list.get((i));
            if (Character.isLetter(character)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
