package Group3_Tasks;

public class numbersFinra {

    public static void resultFinra(){

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }
    public static void main(String[] args) {
        resultFinra();
    }
}


