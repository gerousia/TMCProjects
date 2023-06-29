import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        people.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
