package W06_ObjectsAndClasses.Exercises.P07_OrderedByAge;

public class SecondPerson {
    private String name;
    private int age;
    private String id;


    public SecondPerson(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }

}
