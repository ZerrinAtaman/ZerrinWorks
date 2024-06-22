package Group3_Tasks.Flip_Tasks;

public class ReverseString {

    public static void main(String[] args) {

        String word = "Zerrin";
        char[] charArray = word.toCharArray();

        for (int i = word.length() - 1; i >=0  ; i--) {
            System.out.print(charArray[i]);
        }
    }
}


