import java.util.List;

public class Class2 {
    public static void main(String[] args) {
        String filePath = "D:\\Downloads\\StudentsPerformance.csv";

        StudentReader reader = new StudentReader(filePath);
        List<Student> students = reader.readData();

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
