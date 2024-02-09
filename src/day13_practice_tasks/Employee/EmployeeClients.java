package day13_practice_tasks.Employee;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Zeynep", "Z1234", "Tester",
                90_000, "Cydeo");
        System.out.println("Employee1: " + employee1);
        employee1.work();

        Developer employee2 = new Developer("Mehmet", "M1234", "Developer",
                90_000, "Cydeo", "Java");
        System.out.println("Employee2: " + employee2);
        employee2.work();

        Employee employee3 = new Employee("Elif", "E1234", "Teacher",
                70_000, "Cydeo");
        System.out.println("Employee3: " + employee3);
        employee3.work();

        Employee employee4 = new Employee("Ahmet", "A1234", "Driver",
                50_000, "Cydeo");
        System.out.println("Employee4: " + employee4);
        employee4.work();
    }
}

