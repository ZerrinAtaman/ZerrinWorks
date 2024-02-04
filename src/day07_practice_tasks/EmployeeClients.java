package day07_practice_tasks;

public class EmployeeClients {

    public EmployeeClients() {
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        /*employee1.name = "Nicole Parsie";
        employee1.age = 28;
        employee1.gender = 'F';
        employee1.jobTitle = "Project Manager";
        employee1.salary = 100_000;*/

        employee1.setInfo("Zerrin", 38, 'F', "QA", 105_000);// setinfo ile tum bilgileri tekrar girmeden otomatik cagirmis olursun.

        employee1.work();

        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.name = "Jack Harrison";
        employee2.age = 35;
        employee2.gender = 'M';
        employee2.jobTitle = "Developer";
        employee2.salary = 100_000;

        employee2.work();

        System.out.println(employee2);
    }
}
