public class Student {
    private String gender;
    private String race;
    private String parentalEducation;
    private String lunch;
    private String prepCourse;
    private int mathScore;
    private int readingScore;
    private int writingScore;

    public Student(String gender, String race, String parentalEducation, String lunch, String prepCourse,
                   int mathScore, int readingScore, int writingScore) {
        this.gender = gender;
        this.race = race;
        this.parentalEducation = parentalEducation;
        this.lunch = lunch;
        this.prepCourse = prepCourse;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getParentalEducation() {
        return parentalEducation;
    }

    public String getLunch() {
        return lunch;
    }

    public String getPrepCourse() {
        return prepCourse;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public int getWritingScore() {
        return writingScore;
    }

    @Override
    public String toString() {
        return "Gender: " + gender +
                ", Race: " + race +
                ", Parent Education: " + parentalEducation +
                ", Lunch: " + lunch +
                ", Prep Course: " + prepCourse +
                ", Math Score: " + mathScore +
                ", Reading Score: " + readingScore +
                ", Writing Score: " + writingScore;
    }
}
