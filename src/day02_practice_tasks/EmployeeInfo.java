package day02_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {

        int countryCode = 1;
        int areaCode = 703;
        int localNumber = 4512625;

        System.out.println("Phone number is: +" +countryCode+"("+areaCode + ")-"+localNumber );

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String emplpyeeId = "B101";

        System.out.println("Employee name: "+employeeName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+emplpyeeId);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Company name: "+companyName);
        System.out.println("Full time: "+isFullTime);
        System.out.println("Years of  work experience: "+yearsOfExperience);
        System.out.println("Salary: $"+salary+".0");
        System.out.println("Married: "+isMarried);
    }
}
