package day13_practice_tasks.Student;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void name(String name) {
        if (name == null || name.isEmpty() || name.equals(" "))
            System.exit(1);
    }
    public void age(int age) {
        if (age <= 0)
            System.exit(1);
    }
}
