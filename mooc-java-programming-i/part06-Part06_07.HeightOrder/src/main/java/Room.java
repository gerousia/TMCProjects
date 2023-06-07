import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return persons.size() < 1;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for (Person person : persons) {
            shortestPerson = shortestPerson.getHeight() < person.getHeight() ? shortestPerson : person;
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.shortest();
        Person person = new Person(shortestPerson.getName(), shortestPerson.getHeight());
        this.persons.remove(shortestPerson);
        return person;
    }
}
