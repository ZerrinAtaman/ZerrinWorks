package day13_practice_tasks.Student;

public class StudentClients {
    public static void main(String[] args) {

        Student student = new Student("Elif", 21, "Female");
        System.out.println("Student 1: " + student);

        Student1 student2 = new Student1("Mehmet", 22, "Male", "A12345", "Civil Engineering", 'A', "X University");
        System.out.println("Student 2: " + student2);
        student2.study();

        GraduateStudent student3 = new GraduateStudent("Zeynep", 23, "Female", "C54321",
                "Business Administration", 'B', "Z University");
        System.out.println("Graduate Student: " + student3);
        student3.study();

        CydeoStudent student4 = new CydeoStudent("Ahmet", 24, "Male", "B11223", "Software Engineering", 'A',
                "Y University", 2024, 3, "Java");
        System.out.println("Cydeo Student: " + student4);
        student4.study();
    }
}


