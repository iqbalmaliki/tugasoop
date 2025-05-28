import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {
    private String filePath;

    public StudentReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Student> readData() {
        List<Student> studentList = new ArrayList<>();
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if (data.length >= 8) {
                    String gender = data[0].trim();
                    String race = data[1].trim();
                    String parentalEducation = data[2].trim();
                    String lunch = data[3].trim();
                    String prepCourse = data[4].trim();
                    int mathScore = Integer.parseInt(data[5].trim().replaceAll("\"", ""));
                    int readingScore = Integer.parseInt(data[6].trim().replaceAll("\"", ""));
                    int writingScore = Integer.parseInt(data[7].trim().replaceAll("\"", ""));


                    studentList.add(new Student(gender, race, parentalEducation, lunch, prepCourse,
                            mathScore, readingScore, writingScore));
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in CSV: " + e.getMessage());
        }

        return studentList;
    }
}
