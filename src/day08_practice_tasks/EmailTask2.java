package day08_practice_tasks;


import java.util.Scanner;
public class EmailTask2 {


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter your E-Mail :");
        String emailAddress = str.nextLine();

        eMailInfo(emailAddress);

        str.close();

        }
    public static void eMailInfo(String emailAddress) {
        int underscore = emailAddress.indexOf('_');
        int atSymbol = emailAddress.indexOf('@');

        if (underscore != -1 && atSymbol != -1) {
            String firstName = emailAddress.substring(0, underscore);
            String lastName = emailAddress.substring(underscore + 1, atSymbol);
            String domain = emailAddress.substring(atSymbol + 1);


            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid");
        }
    }
}

