package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent.schoolName = "CYDEO";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        CydeoStudent student1 = new CydeoStudent("Sibel Oz", 45, 505, "A", 1234, 4);
        CydeoStudent student2 = new CydeoStudent("Murat San", 37, 506, "A", 1357, 2);

        student1.study();
        student2.attendClass();

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
