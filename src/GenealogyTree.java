import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GenealogyTree implements Serializable, Iterable<Person> {
    private static final long serialVersionUID = 1L;
    private final List<Person> people;

    public GenealogyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getChildren(Person person) {
        return person.getChildren();
    }

    public List<Person> getPeople() {
        return people;
    }

    public List<Person> getSortedByName() {
        return people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    public List<Person> getSortedByBirthDate() {
        return people.stream()
                .sorted(Comparator.comparing(Person::getBirthDate))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}


