package day08_practice_tasks;

import java.util.Scanner;

public class Email_Task {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter you E-Mail:");
        String emailAddress = str.nextLine();

        String updatedEmail = eMail(emailAddress);
        System.out.println("Update E-Mail: " + updatedEmail);

        str.close();
    }
    //zerrin_basyurt@gmail.com
    public static String eMail(String emailAddress) {
        int atPosition = emailAddress.indexOf('@');
        String secondPart = emailAddress.substring(atPosition);
        String firstPart = emailAddress.replace("@" + secondPart, "");

        int underscorePosition = firstPart.indexOf('_');
        if(underscorePosition == -1) {
            return emailAddress;
        }
        else {
            String surname = firstPart.substring(underscorePosition);
            String firstname = firstPart.replace("_" + surname, "");

            return surname + "_" + firstname + "@" + secondPart;
        }

    }


    public static String eMail_(String emailAddress) {
        int underscore = emailAddress.indexOf('_');
        int atSymbol = emailAddress.indexOf('@');

        if (underscore != -1 && atSymbol != -1) {
            String firstName = emailAddress.substring(0, underscore);
            String lastName = emailAddress.substring(underscore + 1, atSymbol);
            String domain = emailAddress.substring(atSymbol);

            return lastName + "_" + firstName + domain;
        } else {
            return emailAddress;
        }
    }
}