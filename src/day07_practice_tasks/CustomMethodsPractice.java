package day07_practice_tasks;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        String result = day(1);
        System.out.println(result);
    }

    public static String day(int num) { //parameter must have information

        String name = "";

        switch (num) {
            case 1:
                name = ("Monday");
                break;
            case 2:
                name = ("Tuesday");
                break;
            case 3:
                name = ("Wednesday");
                break;
            case 4:
                name = ("Thursday");
                break;
            case 5:
                name = ("Friday");
                break;
            case 6:
                name = ("Saturday");
                break;
            case 7:
                name = ("Sunday");
                break;
            default:
                name = ("Invalid");

        }

        return name;
    }
}




