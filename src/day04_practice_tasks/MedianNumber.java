package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 30;

        boolean aIsMedianNumber = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedianNumber = (a > b && b > c ) || (c > b && b > a);
        boolean cIsMedianNumber = (a > c && c > b) || (b > c && c > a);

        if (aIsMedianNumber){
            System.out.println("aIsMedian = " + a);
        } else if (bIsMedianNumber){
            System.out.println("bIsMedianNumber= " + b);
        }else{
            System.out.println("cIsMedianNumber= " + c);
        }
    }
}
