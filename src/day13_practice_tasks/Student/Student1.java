package day13_practice_tasks.Student;

public class Student1 extends Student {
    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student1(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;

    }

    public String toString() {
        return "Student1{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void study(){

        System.out.println(getName()+" is studying " + schoolName);
    }
}








