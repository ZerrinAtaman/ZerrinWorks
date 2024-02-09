package day09_practice_tasks;

public class StudentGrade {

    public static void main(String[] args) {

        String[] studentNames = {"Zerrin", "Elif", "Seda"};
        int[] scores = {90, 75, 60};
        char grade = ' ';

        for (int i = 0; i < studentNames.length; i++) {

            if (scores[i] >= 90) {
                grade = 'A';
            } else if (scores[i] >= 80) {
                grade = 'B';
            } else if (scores[i] >= 70) {
                grade = 'C';
            }
            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grade);
        }
    }
}
