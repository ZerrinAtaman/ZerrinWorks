package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        double salaryBeforetax = hourlyRate*weeklyHours*52;
        double stateTax = (salaryBeforetax*stateTaxRate)/100;
        double federalTax = (salaryBeforetax*federalTaxRate)/100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforetax - totalTax;

        System.out.println("Gross pay is: $"+salaryBeforetax);
        System.out.println("Federal tax is: $"+ federalTax);
        System.out.println("State tax is $"+ stateTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);
    }
}
