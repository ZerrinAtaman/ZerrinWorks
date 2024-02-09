package day11_practice_tasks;

public class CydeoStudent {

    public String name;
    public int age;
    public int id;
    public String grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, int id, String grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study (){
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }
    public static void  printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }
    public static void printProgLanguage(){
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
