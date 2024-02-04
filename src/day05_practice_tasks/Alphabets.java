package day05_practice_tasks;

public class Alphabets {

    public static void main(String[] args) {

        for (char letter = 'A'; letter <= 'E'; letter++) {
            for (char letters = 'a'; letters <= 'z'; letters++) {
                System.out.print(letter);
                System.out.print(letters + " ");

                //System.out.println("" + letter + letters) + " ";  Outputu ayrica bu sekilde de yazabilirsin.
            }
            System.out.println(" ");
        }
    }
}
