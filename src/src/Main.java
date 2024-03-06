import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(new Student("Gabriel", 31),
                new Student("Giulia", 31),
                new Student("Linda", 25),
                new Student("Manuel", 35),
                new Student("Samuele", 28),
                new Student("Giovanni", 24),
                new Student("Sergio", 22),
                new Student("Silvio", 20),
                new Student("Davide", 19),
                new Student("Andrea", 23),
                new Student("Ludovica", 27),
                new Student("Donatella", 29)
                ));
        System.out.println(studentList);

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(studentList);
    }

}