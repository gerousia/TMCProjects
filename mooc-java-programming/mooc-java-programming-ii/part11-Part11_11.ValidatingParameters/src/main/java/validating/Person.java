package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) throw new IllegalArgumentException("");
        if (0 > age || age > 120) throw new IllegalArgumentException("");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
