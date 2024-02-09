package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Zeynep", 32, 'F', "Project Manager", 100_000);
        Employee employee2 = new Employee("Mehmet", 30, 'M', "Developer", 100_000);

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
    }
}
