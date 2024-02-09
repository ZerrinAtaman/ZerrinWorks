package day13_practice_tasks.Student;

public class CydeoStudent extends Student1 {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade,
                        String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }
    public void study(){
        System.out.println(getName() + " is studying "+ programmingLanguage + " as a Cydeo student.");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", studentId='" + getStudentId() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}


