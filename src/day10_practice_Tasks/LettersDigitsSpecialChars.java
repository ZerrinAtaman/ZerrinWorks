package day10_practice_Tasks;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "";
        int digits = 0;
        String specialChars = "";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters += c;
            } else if (Character.isDigit(c)) {
                digits += c;
            } else {
                specialChars += c;
            }
        }
        System.out.println("letters= \"" + letters + "\";");
        System.out.println("Digits= \"" + digits + "\";");
        System.out.println("SpecialChars= \"" + specialChars + "\";");
        }
    }



//String str = "a1c2c3d4!@#$";
//
//        for (char each : str.toCharArray()) {
//            if (Character.isDigit(each)) {
//                System.out.print(each + " ");
//            }
//        }//