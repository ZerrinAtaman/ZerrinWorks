package day04_practise_tasks;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 5;

        switch (month) {
            case 1:
            case 3:
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31 days");
                break;

            case 2:
                System.out.println("28 days");
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30 days");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
