package day09_practice_tasks;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] classMates = {"Zerrin Ataman", "Mehmet Er", "Elif Can", "Murat Akkaya", "Zeynep Erdogan", 
                "Mustafa Koc", "Fatma Ozer", "Hakan Sahin", "Sibel Erdogan", "Ahmet Celik"};

        for (int i = 0; i < classMates.length; i++) {
            String eachName = classMates[i];
            System.out.println(eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf(" ") + 1) + ".");
        }
    }
}
