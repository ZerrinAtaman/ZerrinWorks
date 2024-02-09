package day13_practice_tasks.Student;

public class GraduateStudent extends Student1 {
    public GraduateStudent(String name, int age, String gender, String studentId,
                           String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);

    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying for a graduate degree.");
    }
}

