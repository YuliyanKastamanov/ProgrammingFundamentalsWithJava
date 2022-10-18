package W06_ObjectsAndClasses.Exercises.P05_Students;

public class Students {

    private String firstName;
    private String secondName;
    private Double grade;

    public Double getGrade() {
        return grade;
    }

    public Students(String firstName, String secondName, Double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    @Override
    public String toString(){

        return String.format("%s %s: %.2f",firstName, secondName, grade);
    }

}
